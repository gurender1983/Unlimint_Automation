package Cucumber;



public class TestContext {
	private ScenarioContext scenarioContext;
    private static TestContext testContext;
	
	public TestContext ()
	{
		
	}
	
	public static TestContext GetInstance(){
        if(testContext==null){
            testContext=new TestContext();
        }
        return testContext;
    }

    public ScenarioContext getScenarioContext() {
        if(scenarioContext==null){
            scenarioContext=new ScenarioContext();
        }
        return scenarioContext;
    }

}
