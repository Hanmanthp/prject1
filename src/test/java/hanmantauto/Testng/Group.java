package hanmantauto.Testng;


import org.testng.annotations.Test;


@Test (groups="all")
public class Group {
	
	
		
		

		@Test (groups={"sanity","smoke"} ,priority=1,invocationCount=5)
		public void test1() {
			System.out.println("BeforeSuite");
			
		}

		@Test(groups="regression",timeOut=50000)
		public void test2() {
			System.out.println("BeforeTest");
		}

		@Test (groups="bbt",dependsOnMethods="test1")
		public void test3() {
			System.out.println("BeforeClass");
		}

		@Test (groups= {"regression","sanity"})
		public void test4() {
			System.out.println("BeforeMethod");
		}

		@Test (groups= {"regression","sanity","smoke"})
		public void test5() {
			System.out.println("Test");
		}

		@Test (groups= {"regression","bbt"})
		public void test6() {
			System.out.println("after method");
		}

		@Test (groups= {"bbt","sanity"})
		public void test7() {
			System.out.println("afterClass");
		}

		@Test (groups= {"smoke","sanity"})
		public void test8() {
			System.out.println("after test");
		}

		@Test (groups= {"regression","sanity","bbt"})
		public void test9() {
			System.out.println("after suite2");
		}

		

	}



