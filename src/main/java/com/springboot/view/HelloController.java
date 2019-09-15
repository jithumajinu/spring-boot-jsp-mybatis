package com.springboot.view;

import com.springboot.view.model.Employee;
import com.springboot.view.repository.EmployeeMyBatisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private EmployeeMyBatisRepository employeeRepository;


    @GetMapping({"/", "/hello"})
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") Long id) {


        try {
            //  System.out.println("Inserting -> {}"+employeeRepository.insert(new Employee(10013L, "tony", "stark", "stark@gmail.com")));
            Employee emp = employeeRepository.findById(id);
            String name = emp.getFirstName();
        /*    List<Employee> empL = employeeRepository.findAll();

            System.out.println("empL.size()="+empL.size());

            for(int i=0;i<empL.size();i++)
            {
                Employee emm=empL.get(i);

                System.out.println(" Name - : "+emm.getFirstName());

               // name = emm.getEmailId();
            }


*/
            model.addAttribute("name", name);

        } catch (Exception e) {

        }

        return "hello";
    }



}
