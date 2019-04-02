package com.ComStore.controller;

import java.io.File;  
import java.util.List;  
  
import javax.xml.bind.JAXBContext;  
import javax.xml.bind.JAXBException;  
import javax.xml.bind.Unmarshaller;

import com.ComStore.model.*;
import com.ComStore.service.saveXMLData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;  

@Controller   
public class XmlToObject {
	
	@Autowired
	private saveXMLData savexml;
	
	@RequestMapping("/")
    public void roshan(@ModelAttribute("customer") Question ques) { 
		
     try {  
   
        File file = new File("/question.xml");  
        JAXBContext jaxbContext = JAXBContext.newInstance(Question.class);  
   
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
        Question que= (Question) jaxbUnmarshaller.unmarshal(file);  
          
        System.out.println(que.getId()+" "+que.getQuestionname());  
        System.out.println("Answers:");  
        List<Answer> list=que.getAnswers();  
        for(Answer ans:list)  
          System.out.println(ans.getId()+" "+ans.getAnswername()+"  "+ans.getPostedby());
    		
    		// save the question using our service
    		savexml.saveData(que);	
   
      } catch (JAXBException e) {  
        e.printStackTrace();  
      }  
   
    }  
}