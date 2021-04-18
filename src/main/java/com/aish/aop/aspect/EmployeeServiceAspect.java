package com.aish.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.aish.aop.models.Employee;

@Aspect
@Component
public class EmployeeServiceAspect {

	@Before(value = "execution(* com.aish.aop.services.EmployeeService.*(..)) and args(employee)")
	public void beforeAdvice(JoinPoint joinPoint,Employee employee) {
		
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println("Created employee with name "+employee.getFirstName());
	}
	
	
	
}
