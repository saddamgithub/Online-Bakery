package com.myWicket;

import java.util.Arrays;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.Radio;
import org.apache.wicket.markup.html.form.RadioChoice;
import org.apache.wicket.markup.html.form.RadioGroup;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

public class EchoText extends WebPage{
	
	private TextField studentName;
	private TextField startDate;
	private TextField endDate;
	private TextField preceptorName;

	
	
	public EchoText(){
		Form form = new Form("EvaluationForm");
		studentName = new TextField("studentName",new Model(""));
		startDate = new TextField("startDate",new Model(""));
		endDate = new TextField("endDate",new Model(""));
		preceptorName = new TextField("preceptorName",new Model(""));
		
		form.add(studentName);
		form.add(startDate);
		form.add(endDate);
		form.add(preceptorName);
		
		//IModel<Company> selected = new Model<Company>();
		IModel<String> OralSelected = new Model<String>();
		
		final RadioGroup OralRadio = new RadioGroup("OralRadio", OralSelected);        
        OralRadio.add(new Radio("NA", new Model<String>("NA")));
        OralRadio.add(new Radio("poor", new Model<String>("poor")));
        OralRadio.add(new Radio("fair", new Model<String>("fair")));
        OralRadio.add(new Radio("good", new Model<String>("good")));
        OralRadio.add(new Radio("verygood", new Model<String>("verygood")));
        OralRadio.add(new Radio("excellent", new Model<String>("excellent")));
        form.add(OralRadio);
        
        IModel<String> WrittenSelected = new Model<String>();
        final RadioGroup WrittenRadio = new RadioGroup("WrittenRadio", WrittenSelected);        
        WrittenRadio.add(new Radio("NA", new Model<String>("NA")));
        WrittenRadio.add(new Radio("poor", new Model<String>("poor")));
        WrittenRadio.add(new Radio("fair", new Model<String>("fair")));
        WrittenRadio.add(new Radio("good", new Model<String>("good")));
        WrittenRadio.add(new Radio("verygood", new Model<String>("verygood")));
        WrittenRadio.add(new Radio("excellent", new Model<String>("excellent")));
        form.add(WrittenRadio);

        IModel<String> PresentationSelected = new Model<String>();
        final RadioGroup PresentationRadio = new RadioGroup("PresentationRadio", PresentationSelected);        
        PresentationRadio.add(new Radio("NA", new Model<String>("NA")));
        PresentationRadio.add(new Radio("poor", new Model<String>("poor")));
        PresentationRadio.add(new Radio("fair", new Model<String>("fair")));
        PresentationRadio.add(new Radio("good", new Model<String>("good")));
        PresentationRadio.add(new Radio("verygood", new Model<String>("verygood")));
        PresentationRadio.add(new Radio("excellent", new Model<String>("excellent")));
        form.add(PresentationRadio);

        IModel<String> KnowledgeSelected = new Model<String>();
        final RadioGroup KnowledgeRadio = new RadioGroup("KnowledgeRadio", KnowledgeSelected);        
        KnowledgeRadio.add(new Radio("NA", new Model<String>("NA")));
        KnowledgeRadio.add(new Radio("poor", new Model<String>("poor")));
        KnowledgeRadio.add(new Radio("fair", new Model<String>("fair")));
        KnowledgeRadio.add(new Radio("good", new Model<String>("good")));
        KnowledgeRadio.add(new Radio("verygood", new Model<String>("verygood")));
        KnowledgeRadio.add(new Radio("excellent", new Model<String>("excellent")));
        form.add(KnowledgeRadio);

        IModel<String> AcademicAbilitySelected = new Model<String>();
        final RadioGroup AcademicAbilityRadio = new RadioGroup("AcademicAbilityRadio", AcademicAbilitySelected);        
        AcademicAbilityRadio.add(new Radio("NA", new Model<String>("NA")));
        AcademicAbilityRadio.add(new Radio("poor", new Model<String>("poor")));
        AcademicAbilityRadio.add(new Radio("fair", new Model<String>("fair")));
        AcademicAbilityRadio.add(new Radio("good", new Model<String>("good")));
        AcademicAbilityRadio.add(new Radio("verygood", new Model<String>("verygood")));
        AcademicAbilityRadio.add(new Radio("excellent", new Model<String>("excellent")));
        form.add(AcademicAbilityRadio);

        IModel<String> IndependentAbility1Selected = new Model<String>();
        final RadioGroup IndependentAbilityRadio1 = new RadioGroup("IndependentAbilityRadio1", IndependentAbility1Selected);        
        IndependentAbilityRadio1.add(new Radio("NA", new Model<String>("NA")));
        IndependentAbilityRadio1.add(new Radio("poor", new Model<String>("poor")));
        IndependentAbilityRadio1.add(new Radio("fair", new Model<String>("fair")));
        IndependentAbilityRadio1.add(new Radio("good", new Model<String>("good")));
        IndependentAbilityRadio1.add(new Radio("verygood", new Model<String>("verygood")));
        IndependentAbilityRadio1.add(new Radio("excellent", new Model<String>("excellent")));
        form.add(IndependentAbilityRadio1);

        IModel<String> IndependentAbility2Selected = new Model<String>();
        final RadioGroup IndependentAbilityRadio2 = new RadioGroup("IndependentAbilityRadio2", IndependentAbility2Selected);        
        IndependentAbilityRadio2.add(new Radio("NA", new Model<String>("NA")));
        IndependentAbilityRadio2.add(new Radio("poor", new Model<String>("poor")));
        IndependentAbilityRadio2.add(new Radio("fair", new Model<String>("fair")));
        IndependentAbilityRadio2.add(new Radio("good", new Model<String>("good")));
        IndependentAbilityRadio2.add(new Radio("verygood", new Model<String>("verygood")));
        IndependentAbilityRadio2.add(new Radio("excellent", new Model<String>("excellent")));
        form.add(IndependentAbilityRadio2);

        IModel<String> TeamworkAbility1Selected = new Model<String>();
        final RadioGroup TeamworkAbilityRadio1 = new RadioGroup("TeamworkAbilityRadio1", TeamworkAbility1Selected);        
        TeamworkAbilityRadio1.add(new Radio("NA", new Model<String>("NA")));
        TeamworkAbilityRadio1.add(new Radio("poor", new Model<String>("poor")));
        TeamworkAbilityRadio1.add(new Radio("fair", new Model<String>("fair")));
        TeamworkAbilityRadio1.add(new Radio("good", new Model<String>("good")));
        TeamworkAbilityRadio1.add(new Radio("verygood", new Model<String>("verygood")));
        TeamworkAbilityRadio1.add(new Radio("excellent", new Model<String>("excellent")));
        form.add(TeamworkAbilityRadio1);

        IModel<String> TeamworkAbility2Selected = new Model<String>();
        final RadioGroup TeamworkAbilityRadio2 = new RadioGroup("TeamworkAbilityRadio2", TeamworkAbility2Selected);        
        TeamworkAbilityRadio2.add(new Radio("NA", new Model<String>("NA")));
        TeamworkAbilityRadio2.add(new Radio("poor", new Model<String>("poor")));
        TeamworkAbilityRadio2.add(new Radio("fair", new Model<String>("fair")));
        TeamworkAbilityRadio2.add(new Radio("good", new Model<String>("good")));
        TeamworkAbilityRadio2.add(new Radio("verygood", new Model<String>("verygood")));
        TeamworkAbilityRadio2.add(new Radio("excellent", new Model<String>("excellent")));
        form.add(TeamworkAbilityRadio2);

        IModel<String> TeamworkAbility3Selected = new Model<String>();
        final RadioGroup TeamworkAbilityRadio3 = new RadioGroup("TeamworkAbilityRadio3", TeamworkAbility3Selected);        
        TeamworkAbilityRadio3.add(new Radio("NA", new Model<String>("NA")));
        TeamworkAbilityRadio3.add(new Radio("poor", new Model<String>("poor")));
        TeamworkAbilityRadio3.add(new Radio("fair", new Model<String>("fair")));
        TeamworkAbilityRadio3.add(new Radio("good", new Model<String>("good")));
        TeamworkAbilityRadio3.add(new Radio("verygood", new Model<String>("verygood")));
        TeamworkAbilityRadio3.add(new Radio("excellent", new Model<String>("excellent")));
        form.add(TeamworkAbilityRadio3);

        IModel<String> Initiative1Selected = new Model<String>();
        final RadioGroup InitiativeRadio1 = new RadioGroup("InitiativeRadio1", Initiative1Selected);        
        InitiativeRadio1.add(new Radio("NA", new Model<String>("NA")));
        InitiativeRadio1.add(new Radio("poor", new Model<String>("poor")));
        InitiativeRadio1.add(new Radio("fair", new Model<String>("fair")));
        InitiativeRadio1.add(new Radio("good", new Model<String>("good")));
        InitiativeRadio1.add(new Radio("verygood", new Model<String>("verygood")));
        InitiativeRadio1.add(new Radio("excellent", new Model<String>("excellent")));
        form.add(InitiativeRadio1);

        IModel<String> Initiative2Selected = new Model<String>();
        final RadioGroup InitiativeRadio2 = new RadioGroup("InitiativeRadio2", Initiative2Selected);        
        InitiativeRadio2.add(new Radio("NA", new Model<String>("NA")));
        InitiativeRadio2.add(new Radio("poor", new Model<String>("poor")));
        InitiativeRadio2.add(new Radio("fair", new Model<String>("fair")));
        InitiativeRadio2.add(new Radio("good", new Model<String>("good")));
        InitiativeRadio2.add(new Radio("verygood", new Model<String>("verygood")));
        InitiativeRadio2.add(new Radio("excellent", new Model<String>("excellent")));
        form.add(InitiativeRadio2);

        IModel<String> Professionalism1Selected = new Model<String>();
        final RadioGroup ProfessionalismRadio1 = new RadioGroup("ProfessionalismRadio1",Professionalism1Selected);        
        ProfessionalismRadio1.add(new Radio("NA", new Model<String>("NA")));
        ProfessionalismRadio1.add(new Radio("poor", new Model<String>("poor")));
        ProfessionalismRadio1.add(new Radio("fair", new Model<String>("fair")));
        ProfessionalismRadio1.add(new Radio("good", new Model<String>("good")));
        ProfessionalismRadio1.add(new Radio("verygood", new Model<String>("verygood")));
        ProfessionalismRadio1.add(new Radio("excellent", new Model<String>("excellent")));
        form.add(ProfessionalismRadio1);

        IModel<String> Professionalism2Selected = new Model<String>();
        final RadioGroup ProfessionalismRadio2 = new RadioGroup("ProfessionalismRadio2", Professionalism2Selected);        
        ProfessionalismRadio2.add(new Radio("NA", new Model<String>("NA")));
        ProfessionalismRadio2.add(new Radio("poor", new Model<String>("poor")));
        ProfessionalismRadio2.add(new Radio("fair", new Model<String>("fair")));
        ProfessionalismRadio2.add(new Radio("good", new Model<String>("good")));
        ProfessionalismRadio2.add(new Radio("verygood", new Model<String>("verygood")));
        ProfessionalismRadio2.add(new Radio("excellent", new Model<String>("excellent")));
        form.add(ProfessionalismRadio2);

        IModel<String> Professionalism3Selected = new Model<String>();
        final RadioGroup ProfessionalismRadio3 = new RadioGroup("ProfessionalismRadio3", Professionalism3Selected);        
        ProfessionalismRadio3.add(new Radio("NA", new Model<String>("NA")));
        ProfessionalismRadio3.add(new Radio("poor", new Model<String>("poor")));
        ProfessionalismRadio3.add(new Radio("fair", new Model<String>("fair")));
        ProfessionalismRadio3.add(new Radio("good", new Model<String>("good")));
        ProfessionalismRadio3.add(new Radio("verygood", new Model<String>("verygood")));
        ProfessionalismRadio3.add(new Radio("excellent", new Model<String>("excellent")));
        form.add(ProfessionalismRadio3);

        IModel<String> Professionalism4Selected = new Model<String>();
        final RadioGroup ProfessionalismRadio4 = new RadioGroup("ProfessionalismRadio4", Professionalism4Selected);        
        ProfessionalismRadio4.add(new Radio("NA", new Model<String>("NA")));
        ProfessionalismRadio4.add(new Radio("poor", new Model<String>("poor")));
        ProfessionalismRadio4.add(new Radio("fair", new Model<String>("fair")));
        ProfessionalismRadio4.add(new Radio("good", new Model<String>("good")));
        ProfessionalismRadio4.add(new Radio("verygood", new Model<String>("verygood")));
        ProfessionalismRadio4.add(new Radio("excellent", new Model<String>("excellent")));
        form.add(ProfessionalismRadio4);

        IModel<String> SatisfactionSelected = new Model<String>();
        final RadioGroup SatisfactionRadio = new RadioGroup("SatisfactionRadio", SatisfactionSelected);        
        SatisfactionRadio.add(new Radio("NA", new Model<String>("NA")));
        SatisfactionRadio.add(new Radio("poor", new Model<String>("poor")));
        SatisfactionRadio.add(new Radio("fair", new Model<String>("fair")));
        SatisfactionRadio.add(new Radio("good", new Model<String>("good")));
        SatisfactionRadio.add(new Radio("verygood", new Model<String>("verygood")));
        SatisfactionRadio.add(new Radio("excellent", new Model<String>("excellent")));
        form.add(SatisfactionRadio);
        
        IModel<String> RequirementSelected = new Model<String>();
        final RadioGroup RequirementRadio = new RadioGroup("RequirementRadio", RequirementSelected);        
        RequirementRadio.add(new Radio("yes", new Model<String>("yes")));
        RequirementRadio.add(new Radio("no", new Model<String>("no")));
        form.add(RequirementRadio);

        final TextArea<String> RequirementExplanation = new TextArea<String>("RequirementExplanation",Model.of(""));
        //if(RequirementRadio.equals("yes")) RequirementExplanation.setRequired(true);
        form.add(RequirementExplanation);
              
        final TextArea<String> StudentAccomplishment = new TextArea<String>("StudentAccomplishment",Model.of("")); 
        form.add(StudentAccomplishment);
        
        final TextArea<String> Capability = new TextArea<String>("Capability",Model.of("")); 
        form.add(Capability);
        
        final TextArea<String> ProfessionalWeakness = new TextArea<String>("ProfessionalWeakness",Model.of("")); 
        form.add(ProfessionalWeakness);
        
        IModel<String> ProfessionalWeaknessSelected = new Model<String>();
        final RadioGroup ProfessionalWeaknessRadio = new RadioGroup("ProfessionalWeaknessRadio",ProfessionalWeaknessSelected);        
        ProfessionalWeaknessRadio.add(new Radio("yes", new Model<String>("yes")));
        ProfessionalWeaknessRadio.add(new Radio("no", new Model<String>("no")));
        ProfessionalWeaknessRadio.add(new Radio("NA", new Model<String>("NA")));
        form.add(ProfessionalWeaknessRadio);
        
        final TextArea<String> ProfessionalWeaknessDescription = new TextArea<String>("ProfessionalWeaknessDescription",Model.of("")); 
        form.add(ProfessionalWeaknessDescription);
        
        final TextArea<String> AdditionalCourses = new TextArea<String>("AdditionalCourses",Model.of("")); 
        form.add(AdditionalCourses);
        
        final TextArea<String> StudentContribution = new TextArea<String>("StudentContribution",Model.of("")); 
        form.add(StudentContribution);
        
        final TextArea<String> AdditionalComments = new TextArea<String>("AdditionalComments",Model.of("")); 
        form.add(AdditionalComments);


        
		form.add(new Button("button"){
			@Override
			public void onSubmit(){
				String studentNamevalue = (String)studentName.getModelObject();
				String startDatevalue = (String)startDate.getModelObject();
				String endDatevalue = (String)endDate.getModelObject();
				String preceptorNamevalue = (String)preceptorName.getModelObject();
				
				
				String RequirementExplanationvalue = (String)RequirementExplanation.getModelObject();
				String StudentAccomplishmentvalue = (String)StudentAccomplishment.getModelObject();
				String Capabilityvalue = (String)Capability.getModelObject();
				String ProfessionalWeaknessvalue = (String)ProfessionalWeakness.getModelObject();
				String ProfessionalWeaknessDescriptionvalue = (String)ProfessionalWeaknessDescription.getModelObject();
				String AdditionalCoursesvalue = (String)AdditionalCourses.getModelObject();
				String StudentContributionvalue = (String)StudentContribution.getModelObject();
				String AdditionalCommentsvalue = (String)AdditionalComments.getModelObject();
				
				String OralRadioValue = (String)OralRadio.getModelObject();
				String WrittenRadioValue = (String)WrittenRadio.getModelObject();
				String PresentationRadioValue = (String)PresentationRadio.getModelObject();
				String KnowledgeRadioValue = (String)KnowledgeRadio.getModelObject();
				String AcademicAbilityRadioValue = (String)AcademicAbilityRadio.getModelObject();
				String IndependentAbilityRadio1Value = (String)IndependentAbilityRadio1.getModelObject();
				String IndependentAbilityRadio2Value = (String)IndependentAbilityRadio2.getModelObject();
				String TeamworkAbilityRadio1Value = (String)TeamworkAbilityRadio1.getModelObject();
				String TeamworkAbilityRadio2Value = (String)TeamworkAbilityRadio2.getModelObject();
				String TeamworkAbilityRadio3Value = (String)TeamworkAbilityRadio3.getModelObject();
				String InitiativeRadio1Value = (String)InitiativeRadio1.getModelObject();
				String InitiativeRadio2Value = (String)InitiativeRadio2.getModelObject();
				String ProfessionalismRadio1Value = (String)ProfessionalismRadio1.getModelObject();
				String ProfessionalismRadio2Value = (String)ProfessionalismRadio2.getModelObject();
				String ProfessionalismRadio3Value = (String)ProfessionalismRadio3.getModelObject();
				String ProfessionalismRadio4Value = (String)ProfessionalismRadio4.getModelObject();
				String SatisfactionRadioValue = (String)SatisfactionRadio.getModelObject();
				String RequirementRadioValue = (String)RequirementRadio.getModelObject();
				String ProfessionalWeaknessRadioValue = (String)ProfessionalWeaknessRadio.getModelObject();
			}
		});
			
		add(form);
		
		
	}
}
