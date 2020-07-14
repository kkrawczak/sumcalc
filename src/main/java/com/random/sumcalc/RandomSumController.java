package com.random.sumcalc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.random.sumcalc.model.SourcesVO;
import com.random.sumcalc.service.SourceType;
import com.random.sumcalc.service.SumService;

@Controller
public class RandomSumController {

	@Autowired
	SumService sumService;
	@Autowired
	SourceType sourceType;
	
	@GetMapping("/")
	public ModelAndView hello() {
		SourcesVO sources = new SourcesVO();
		ModelAndView modelAndView = new ModelAndView("index", "command", sources);
		return modelAndView;
	}

	@GetMapping("/calculate")
	public String hello(@ModelAttribute("sources") SourcesVO sources, Model model) {

		for(String source:sources.getCalcSources())
			sumService.addSource(sourceType.someService(source));
		
		model.addAttribute("result", sumService.calculate());
		return "calculate";
	}

	@ModelAttribute("typesOfSource")
	public List<String> getSourcesList() {
		List<String> typesOfSource = new ArrayList<String>();
		typesOfSource.add("DB");
		typesOfSource.add("JAVA");
		typesOfSource.add("HTTP");
		return typesOfSource;
	}

}
