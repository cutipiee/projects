package com.bdd.jbehave;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

public class MyLinkedListStory extends JUnitStory{

	public Configuration configuration() {
		return new MostUsefulConfiguration();
		
	}
	public InjectableStepsFactory stepfactory() {
		return new InstanceStepsFactory(configuration(), new MyLinkListSteps());
		
	}
}
