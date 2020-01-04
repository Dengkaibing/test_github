package cn.hongmao.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.hongmao.bean.Job;
import cn.hongmao.bean.vo.Result;
import cn.hongmao.service.JobService;

@Controller
@RequestMapping("/job")
public class JobController {
	
	@Resource
	private JobService jobService;

	@GetMapping("/home")
	public String home(ModelMap map) {
		return "zhangbin/jobs";
	}
	
	@PostMapping("/home")
	@ResponseBody
	public Result home(@RequestParam(name = "page", required = false, defaultValue = "1")Integer page, 
			@RequestParam(name = "limit", required = false, defaultValue = "10")Integer limit,
			@RequestParam(name = "jName", required = false, defaultValue = "")String jName) {
		PageHelper.startPage(page, limit);
		List<Job> list = jobService.findAll(jName);
		PageInfo<Job> info = new PageInfo<>(list);
		Result r = Result.success();
		r.add("count", info.getTotal());
		r.add("data", list);
		r.setMsg("查询成功");
		return r;
	}
	
	@GetMapping("/info")
	public String info() {
		return "zhangbin/jobInfo";
	}
	
	@GetMapping("findByUserId/{userId}/{jobId}")
	public String findByUserId(@PathVariable(name = "userId")Integer userId, @PathVariable(name = "jobId")Integer jobId, ModelMap map) {
		System.out.println(userId + "," + jobId);
		Job job = jobService.findByUserJobId(userId, jobId);
		map.put("job",job);
		return "zhangbin/jobInfo";
	}
}
