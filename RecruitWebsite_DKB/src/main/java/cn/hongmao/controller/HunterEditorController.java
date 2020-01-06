package cn.hongmao.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.hongmao.bean.City;
import cn.hongmao.bean.Employer;
import cn.hongmao.bean.Job;
import cn.hongmao.bean.JobHunter;
import cn.hongmao.bean.Major;
import cn.hongmao.bean.ProjectInfo;
import cn.hongmao.bean.Province;
import cn.hongmao.bean.School;
import cn.hongmao.bean.UserInfo;
import cn.hongmao.service.CityService;
import cn.hongmao.service.JobHunterService;
import cn.hongmao.service.JobService;
import cn.hongmao.service.MajorService;
import cn.hongmao.service.ProjectInfoService;
import cn.hongmao.service.ProvinceService;
import cn.hongmao.service.SchoolService;
import cn.hongmao.service.UserInfoService;
import cn.hongmao.util.RenamePhoto;

/**
 * 求职方个人中心Controller
 * 
 * @author yanlianshan
 *
 */
@Controller
@RequestMapping(path = "/hunter")
public class HunterEditorController {
	@Resource
	private JobHunterService jobHunterService;
	@Resource
	private SchoolService schoolService;
	@Resource
	private MajorService majorService;
	@Resource
	private ProvinceService provinceService;
	@Resource
	private CityService cityService;
	@Resource
	private JobService jobService;
	@Resource
	private ProjectInfoService projectInfoService;
	@Resource
	private UserInfoService userInfoService;

	/**
	 * 个人中心显示页面
	 * 
	 * @param session HttpSession对象，用于获取用户id
	 * @param map     ModelMap对象，将数据传到前端
	 * @return 个人中心显示页面
	 */
	@GetMapping(path = "/show")
	public String hunterShow(HttpSession session, ModelMap map) {
		UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
		Integer userId = userInfo.getId();
		JobHunter hunter = jobHunterService.findHunter(userId);
		map.put("hunter", hunter);
		return "Hunter/HunterShow";
	}

	/**
	 * 个人中心信息显示页面
	 * 
	 * @param session HttpSession对象，用于获取用户id
	 * @param map     ModelMap对象，将数据传到前端
	 * @return 个人中心信息显示页面
	 */
	@GetMapping(path = "infoShow")
	public String infoShow(HttpSession session, ModelMap map) {
		UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
		Integer userId = userInfo.getId();
		JobHunter hunter = jobHunterService.findHunter(userId);
		System.err.println("91:" + hunter);
		map.put("hunter", hunter);
		return "Hunter/InfoShow";
	}

	/**
	 * 个人中心编辑页面入口
	 * 
	 * @param session HttpSession对象，用于获取用户id
	 * @param map     ModelMap对象，将数据传到前端
	 * @return 个人中心信息编辑页面
	 */
	@GetMapping(path = "editor")
	public String hunterEditor(HttpSession session, ModelMap map) {
		UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
		Integer userId = userInfo.getId();
		JobHunter hunter = jobHunterService.findHunter(userId);
		map.put("hunter", hunter);
		return "Hunter/InfoEditor";
	}

	/**
	 * 个人中心信息编辑页面，编辑后提交入口
	 * 
	 * @param session HttpSession对象，用于获取用户id
	 * @param hunter  JobHunter对象
	 * @param request HttpServletRequest对象，用于获取前端数据
	 * @return 个人中心信息显示页面
	 */
	@GetMapping(path = "editored")
	public String hunterEditor(HttpSession session, HttpServletRequest request, JobHunter hunter) {
		UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
		Integer userId = userInfo.getId();
		hunter.setUserId(userId);
		String provincialID = request.getParameter("province");
		String provincialName = provinceService.findProvinceById(Integer.valueOf(provincialID)).getProvincialName();
		String city = request.getParameter("city");
		if (city.equals(provincialName)) {
			hunter.setJPlace(city);
		} else {
			hunter.setJPlace(provincialName + city);
		}
		jobHunterService.updateHunter(hunter);
		return "redirect:infoShow";
	}

	/**
	 * 获取学校名称
	 * 
	 * @param school 学校对象
	 * @return 学校集合
	 */
	@ResponseBody
	@GetMapping(path = "/school")
	public List<School> findSchool(School school) {
		System.err.println("==========="+school.getSchoolName()+"==========");
		System.err.println("==========="+school.getSchoolName().trim()+"==========");
		school.setSchoolName(school.getSchoolName().trim());
		List<School> list = schoolService.findSchool(school);
		return list;
	}

	/**
	 * 获取专业名称
	 * 
	 * @param major 专业对象
	 * @return 专业集合
	 */
	@ResponseBody
	@GetMapping(path = "/major")
	public List<Major> findMajor(Major major) {
		List<Major> list = majorService.findMajor(major);
		return list;
	}

	/**
	 * 获取省份
	 * 
	 * @return 所有省份集合
	 */
	@GetMapping(path = "province")
	@ResponseBody
	public List<Province> findProvince() {
		List<Province> list = provinceService.findProvince();
		return list;
	}

	/**
	 * 根据省份id获取城市
	 * 
	 * @param provincialID 省份id
	 * @return 城市集合
	 */
	@GetMapping(path = "city")
	@ResponseBody
	public List<City> findCity(Integer provincialID) {
		List<City> list = cityService.findCity(provincialID);
		return list;
	}

	/**
	 * 获取base地
	 * 
	 * @param city 城市对象
	 * @return 城市集合
	 */
	@ResponseBody
	@GetMapping(path = "/base")
	public List<City> findBase(City city) {
		List<City> list = cityService.findCityByName(city);
		return list;
	}

	/**
	 * 获取求职意向
	 * 
	 * @param job 职业对象
	 * @return 职业集合
	 */
	@ResponseBody
	@GetMapping(path = "/job")
	public List<Job> findJob(Job job) {
		System.out.println(job.getJName());
		List<Job> list = jobService.findByJName(job);
		System.out.println(list);
		return list;
	}

	/**
	 * 登录成功后检验是否有个人信息，有则进首页，没有则进信息完善页面
	 * 
	 * @param session HttpSession对象，用于获取用户id
	 * @return 对应页面
	 */
	@GetMapping(path = "insert")
	public String insertInfo(HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
		Integer userId = userInfo.getId();
		System.out.println(userId);
		JobHunter hunter = jobHunterService.findHunter(userId);
		System.out.println("232" + hunter);
		if (hunter == null) {
			return "Hunter/HunterInsert";
		} else {
			return "redirect:/index";
		}
	}

	/**
	 * 信息完善页面
	 * 
	 * @param hunter  JobHunter对象
	 * @param request HttpServletRequest对象，用于获取前端数据
	 * @return 首页
	 */
	@PostMapping(path = "insert")
	public String insertInfo(JobHunter hunter, HttpServletRequest request) {
		System.err.println("245:" + hunter);
		String provincialID = request.getParameter("province");
		String provincialName = provinceService.findProvinceById(Integer.valueOf(provincialID)).getProvincialName();
		String city = request.getParameter("city");
		if (city.equals(provincialName)) {
			hunter.setJPlace(city);
		} else {
			hunter.setJPlace(provincialName + city);
		}
		HttpSession session = request.getSession();
		UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
		Integer userId = userInfo.getId();
		hunter.setUserId(userId);
		System.out.println(hunter);
		boolean b = jobHunterService.insertHunter(hunter);
		System.out.println(b);
		return "redirect:show";
	}
	/**
	 * 文件上传入口
	 * 
	 * @return 文件上传界面
	 */
	@GetMapping(path = "updatePhoto")
	public String updatePhoto() {
		return "Hunter/UpdatePhoto";
	}

	/**
	 * 图片上传功能
	 * 
	 * @param multipartFile MultipartFile对象
	 * @param session       HttpSession对象 ，获取useId
	 * @param map           ModelMap对象，把数据传到前端
	 * @return
	 */
	@PostMapping(path = "photo")
	public String updatePhoto(@RequestParam("file") MultipartFile multipartFile, HttpSession session, ModelMap map) {
		String filename = multipartFile.getOriginalFilename();
		System.out.println(filename);
		int indexOf = filename.lastIndexOf(".");
		String substring = filename.substring(indexOf);
		String newName = RenamePhoto.renamePhoto() + substring;
		System.out.println(newName);
		UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
		Integer userId = userInfo.getId();
		File file = null;
		try {
			file = ResourceUtils.getFile("classpath:");
			file = new File(file + "/static/Hunter/image/upload");
			if (!file.exists()) {
				file.mkdirs();
			}
			System.out.println(file);
			multipartFile.transferTo(new File(file, newName));
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		boolean b = jobHunterService.updateImage(userId, newName);
		System.out.println(b);
		return "redirect:show";
	}

	/**
	 * 项目显示页面
	 * 
	 * @param session HttpSession对象 ，获取useId
	 * @param map     ModelMap对象，把数据传到前端
	 * @return 项目页面
	 */
	@GetMapping(path = "project")
	public String findProject(HttpSession session, ModelMap map) {
		UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
		Integer userId = userInfo.getId();
		List<ProjectInfo> list = projectInfoService.findProject(userId);
		System.out.println(list);
		map.put("project", list);
		System.out.println(5555);
		return "Hunter/HunterProject";
	}

	/**
	 * 项目详情页面入口
	 * 
	 * @param projectId 项目id
	 * @return 项目详情页面
	 */
	@GetMapping("/{projectId}")
	public String projectDescription(@PathVariable("projectId") Integer projectId, ModelMap map) {
		ProjectInfo projectInfo = projectInfoService.findProjectById(projectId);
		map.put("projectInfo", projectInfo);
		System.out.println(projectId);
		return "Hunter/ProjectDescription";
	}

	/**
	 * 修改密码页面入口
	 * 
	 * @return 修改密码页面
	 */
	@GetMapping(path = "changePassword")
	public String changePassword() {
		return "Hunter/ChangePassword";
	}

	/**
	 * 修改密码功能
	 * @param password 旧密码
	 * @param newPassword 新密码
	 * @return 
	 */
	@PostMapping(path = "changePassword")
	@ResponseBody
	public String updatePassword(String newPassword,HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
		Integer userId = userInfo.getId();
		userInfo = userInfoService.findUserInfo(userInfo);
		if(userInfo == null) {
			return "旧密码错误!";
		}
		 boolean bool = userInfoService.updatePassword(userId, newPassword);
		 if(bool) {
			 session.removeAttribute("userInfo");
			 return "修改成功!";
			 
		 }
		return "修改失败!";
	}
	@GetMapping(path="addProject")
	public String addProject() {
		return "Hunter/AddProject";
	}
	@GetMapping(path="added")
	public String added(HttpSession session,ProjectInfo projectInfo) {
		UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
		Integer userId = userInfo.getId();
		projectInfo.setUserId(userId);
		System.out.println(projectInfo);
		projectInfoService.insertProject(projectInfo);
		return "redirect:project";
	}
	
	@GetMapping("delete")
	public String deleteProject(@RequestParam("projectId") Integer projectId) {
		System.out.println(projectId);
		boolean b = projectInfoService.deleteProject(projectId);
		System.out.println(b);
		return "redirect:project";
	}
	
	@GetMapping(path="/fff")
	public String goHome() {
		return "Hunter/home";
	}
}
