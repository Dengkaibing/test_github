layui.use([
	 "jquery",
	 "laytpl",
	 "laydate",
	 "form",
	 "layedit",
	 "slider",
	 "element",
	 "colorpicker",
	 "upload",
	 "rate",
	 "carousel",
     "table",
	 "flow"
	],function(){
	//以下脚本为标签属性转换成layui组件的还原过程
	//调试:打开浏览器控制台(F12),在代码中某行增加 debugger 即可调试
	var $ = 		layui.jquery		, 
	laytpl = 		layui.laytpl		, 
	laydate = 		layui.laydate		, 
	form = 			layui.form			, 
	layedit = 		layui.layedit		, 
	slider = 		layui.slider		, 
	element = 		layui.element		, 
	colorpicker = 	layui.colorpicker	, 
	upload = 		layui.upload		, 
	rate = 			layui.rate			, 
	carousel = 		layui.carousel		, 
	table = 		layui.table			, 
	flow = 			layui.flow			;
	var magicalDragLayuiUtil = {
	    rebuildLayUiControls: function () {
	        var _t = this;
	        //日期
	        $(".magicalcoder-laydate").each(function (idx, item) {
	            laydate.render(_t.iteratorAttr({
	                elem: item
	            }, item));
	        })
	        //富文本
	        $(".magicalcoder-layedit").each(function (idx, item) {
	            var mcDataId = $(item).attr("id");
	            if (mcDataId) {
	                layedit.build(mcDataId, {
	                    height: 300
	                });
	            }
	        })
	        //外键
	        $(".magicalcoder-foreign-select2").each(function (idx, item) {
	            var mcDataId = $(item).attr("id");
	            if (mcDataId) {
	                $("#" + mcDataId).select2({
	                    allowClear: true,
	                    width: "150px",
	                    delay: 500,
	                });
	            }
	        })
	        //颜色选择器
	        $(".magicalcoder-color-picker").each(function (idx, item) {
	            colorpicker.render(_t.iteratorAttr({
	                elem: $(item)}, item));
	        })
	        //上传组件
	        $(".magicalcoder-layupload").each(function (idx, item) {
	            upload.render(_t.iteratorAttr({
	                elem: $(item)}, item));
	        })
	        //滑块
	        $(".magicalcoder-slider").each(function (idx, item) {
	            slider.render(_t.iteratorAttr({
	                elem: $(item)}, item));
	        })
	        //评分
	        $(".magicalcoder-rate").each(function (idx, item) {
	            rate.render(_t.iteratorAttr({
	                elem: $(item)}, item));
	        })
	        //轮播
	        $(".layui-carousel").each(function (idx, item) {
	            carousel.render(_t.iteratorAttr({
	                elem: $(item)}, item));
	        })
	        //流加载
	        $(".magicalcoder-flow").each(function (idx, item) {
	            flow.load(_t.iteratorAttr({
	                elem: $(item)}, item));
	        })
	        //代码
	        $(".magicalcoder-code").each(function (idx, item) {
	            layui.code(_t.iteratorAttr({
	                elem: $(item)}, item));
	        })
	        //弹窗
	        $(".magicalcoder-layer").each(function (idx, item) {
	            //先隐藏起来
	            $(this).next().hide();
	            $(this).click(function () {
	                var config = _t.iteratorAttr({
	                    elem: $(item)}, item);
	                var type = config.type;
	                if (type + '' == 1) {
	                    config.content = $(this).next();
	                }
	                if (config.btn) {
	                    config.btn = config.btn.split(",")
	                }
	                if (config.area) {
	                    config.area = config.area.split(",")
	                }
	                layer.open(config)
	            })
	        })
	        //动态表格 我们单独封装了layui-table的初始化方式 至于数据排序 返回格式 等操作请根据你的具体环境自行封装
	        $(".magicalcoder-table").each(function (idx,
	            item) {
	            var cols = [];
	            //读取列配置
	            $(this).find(".magicalcoder-table-th").each(function (i, th) {
	                cols.push(_t.iteratorAttr({
	                    title: $(this).text()}, th));
	            })
	            var tableConfig = _t.iteratorAttr({
	                elem: $(item),
	                cols: [cols]},
	                item);
	            //此时可以删除辅助列了,删除辅助孩子 在正式发布环境打开此行 布局器暂时不打开
	             $(this).html('');//清空magicalcoder-table-th
	            //初始化表格 至于返回的数据格式 您可以根据自己的系统自行改造 这里仅做一个示例 参考js\\data\\list.json
	            table.render(tableConfig);
	        })
	        //部分组件初始化
	        element.init();
	        //表单初始化
	        form.render();
	    },
	    //将标签上的属性 转换成layui函数初始化时的参数名:参数值
	    iteratorAttr: function (renderConfig, dom) {
	        var attrs = dom.attributes;
	        for (var i = 0; i < attrs.length; i++) {
	            var attr = attrs[i];
	            var name = attr.name;
	            var value = attr.value;
	            if (name.indexOf("mc-") === 0) {
	                name = name.replace("mc-attr-", '');
	                name = name.replace("mc-event-", '');
	                if (name.indexOf('str-') === 0) {
	                    name = name.replace('str-', '');
	                } else if (name.indexOf('bool-') === 0) {
	                    name = name.replace('bool-', '');
	                    value == 'true' || value === '' ? value = true: value = value;
	                    value == 'false' ? value = false: value = value;
	                } else if (name.indexOf('num-') === 0) {
	                    name = name.replace('num-', '');
	                    if (value !== '' && !isNaN(value)) {
	                        value = parseFloat(value);
	                    }
	                } else if (name.indexOf('json-') === 0) {
	                    name = name.replace('json-', '');
	                    if (value !== '') {
	                        value = JSON.parse(value);
	                    }
	                }
	                renderConfig[this.htmlAttrNameToTuoFeng(name)] = value;
	            }
	        }
	        return renderConfig;
	    },
	    //user-name -> userName html上的标签名转换成驼峰名称
	    htmlAttrNameToTuoFeng: function (name) {
	        var arr = name.split("-");
	        var newArr = []
	        for (var i = 0; i < arr.length; i++) {
	            if (i != 0) {
	                if (arr[i] != '') {
	                    newArr.push(this.firstCharToUpLower(arr[i]));
	                }
	            } else {
	                newArr.push(arr[i]);
	            }
	        }
	        return newArr.join('');
	    },
	    //首字母大写
	    firstCharToUpLower: function (name) {
	        var arr = name.split("");
	        arr[0] = arr[0].toUpperCase();
	        return arr.join('');
	    },
	    //初始化图表 如果您未使用echarts可以删除此方法
	    renderEcharts: function () {
	        // 基于准备好的dom，初始化echarts实例
	        var echartsBars = document.getElementsByClassName('echarts-bar');
	        if (echartsBars && echartsBars.length > 0) {
	            for (var i = 0; i < echartsBars.length; i++) {
	                var myChart = echarts.init(echartsBars[i]);
	                // 指定图表的配置项和数据
	                var option = {
	                    title: {
	                        text: '集成ECharts 入门示例'
	                    },
	                    tooltip: {},
	                    legend: {
	                        data: ['销量']
	                    },
	                    xAxis: {
	                        data: ["衬衫",
	                            "羊毛衫",
	                            "雪纺衫",
	                            "裤子",
	                            "高跟鞋",
	                            "袜子"]
	                    },
	                    yAxis: {},
	                    series: [{
	                        name: '销量',
	                        type: 'bar',
	                        data: [5,
	                            20,
	                            36,
	                            10,
	                            10,
	                            20]
	                    }]
	                };
	                // 使用刚指定的配置项和数据显示图表。
	                myChart.setOption(option);
	            }
	        }
	    }
	}
	magicalDragLayuiUtil.rebuildLayUiControls();
	magicalDragLayuiUtil.renderEcharts();
});