package aop.learn.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ModernFirstAspect {

	@Pointcut("execution(* aop.learn.Application.main(..))")
	public void pc1(){}

	/*@Before("pc1()")
	public void beforeMain(){
		System.out.println("---------------------------------");
		System.out.println("---MODERN BEFORE MAIN----");
		System.out.println("---------------------------------");
	}

	@After("pc1()")
	public void afterMain(){
		System.out.println("---------------------------------");
		System.out.println("---MODERN AFTER MAIN----");
		System.out.println("---------------------------------");
	}*/

	@Around("pc1()")
	public void arroundMain(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("---------------------------------");
		System.out.println("---MODERN BEFORE MAIN----");
		System.out.println("---------------------------------");

		joinPoint.proceed();

		System.out.println("---------------------------------");
		System.out.println("---MODERN AFTER MAIN----");
		System.out.println("---------------------------------");
	}
}
