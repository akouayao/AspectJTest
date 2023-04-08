package aop.learn.aspect;


public aspect OldFirstAspect {

	//PointCut
	pointcut pc1(): execution(* *..Application.main(..));

	/*//Code Advice
	before(): pc1(){
		System.out.println("---------------------------------");
		System.out.println("---BEFORE MAIN----");
		System.out.println("---------------------------------");
	}

	//Code Advice
	after(): pc1(){
		System.out.println("---------------------------------");
		System.out.println("---AFTER MAIN----");
		System.out.println("---------------------------------");
	}*/

	void around(): pc1(){
		System.out.println("---------------------------------");
		System.out.println("---BEFORE MAIN----");
		System.out.println("---------------------------------");
		//Execution de l'opération du pointcut
		proceed();
		System.out.println("---------------------------------");
		System.out.println("---AFTER MAIN----");
		System.out.println("---------------------------------");
	}
}
