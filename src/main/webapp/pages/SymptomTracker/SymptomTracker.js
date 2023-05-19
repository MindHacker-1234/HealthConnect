/*
 * Use App.getDependency for Dependency Injection
 * eg: var DialogService = App.getDependency('DialogService');
 */

/* perform any action on widgets/variables within this block */
Page.onReady = function() {
    /*
     * variables can be accessed through 'Page.Variables' property here
     * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
     * Page.Variables.loggedInUser.getData()
     *
     * widgets can be accessed through 'Page.Widgets' property here
     * e.g. to get value of text widget named 'username' use following script
     * 'Page.Widgets.username.datavalue'
     */



};


//  Page.createTable25Form1Submit = function($event, widget, $formData) {
//         const diagnoses = [{
//                 name: "fever",
//                 symptoms: ["cold", "headache", "tiredness", "body pains", "cough"]
//             },
//             {
//                 name: "flu",
//                 symptoms: ["cold", "body pains", "cough", "tiredness", "headaches", "stuffy nose", "sore throat"]
//             },
//             {
//                 name: "Tuberculosis",
//                 symptoms: ["heavy cough", "tiredness", "weight loss", "high fever", "loss of appetite"]
//             }
//         ];

//         const symptom1 = Page.Widgets.createTable25Form1.formWidgets.Table25_symptom1.datavalue;
//         const symptom2 = Page.Widgets.createTable25Form1.formWidgets.Table25_symptom2.datavalue;
//         const symptom3 = Page.Widgets.createTable25Form1.formWidgets.Table25_symptom3.datavalue;
//         const symptom4 = Page.Widgets.createTable25Form1.formWidgets.Table25_symptom4.datavalue;
//         const symptom5 = Page.Widgets.createTable25Form1.formWidgets.Table25_symptom5.datavalue;

//         // Combine user symptoms into an array
//         const userSymptoms = [symptom1, symptom2, symptom3, symptom4, symptom5].filter(function(symptom) {
//             return symptom !== "";
//         });
//         console.log(userSymptoms);
//         const potentialDiagnoses = [];
//         for (const diagnosis of diagnoses) {
//             let matchCount = 0;
//             for (const symptom of userSymptoms) {
//                 if (diagnosis.symptoms.includes(symptom)) {
//                     matchCount++;
//                 }
//             }
//             if (matchCount > 0) {
//                 potentialDiagnoses.push({
//                     name: diagnosis.name,
//                     matchCount: matchCount
//                 });
//             }
//         }

//         potentialDiagnoses.sort(function(a, b) {
//             return b.matchCount - a.matchCount;
//         });
//         console.log(potentialDiagnoses);

//         let diagnosisText = "";
//         if (potentialDiagnoses.length > 0) {
//             const highestMatchCount = potentialDiagnoses[0].matchCount;
//             const highestMatchDiagnoses = potentialDiagnoses.filter(function(diagnosis) {
//                 return diagnosis.matchCount === highestMatchCount;
//             });
//             if (highestMatchDiagnoses.length === 1) {
//                 diagnosisText = "The diagnosis is " + highestMatchDiagnoses[0].name;
//             } else {
//                 diagnosisText = "The possible diagnoses are:\n";
//                 for (let i = 0; i < highestMatchDiagnoses.length; i++) {
//                     diagnosisText += (i + 1) + ". " + highestMatchDiagnoses[i].name + "\n";
//                 }
//             }
//         } else {
//             diagnosisText = "No potential diagnoses found.";
//         }

//         Page.Widgets.label3_1.caption = diagnosisText;
//         Page.Widgets.panel1.show = true;
//     }

Page.SymptomsFilter1_filterAction = function($event) {
    const symptom1 = Page.Widgets.symptom1.datavalue;
    const symptom2 = Page.Widgets.symptom2.datavalue;
    const symptom3 = Page.Widgets.symptom3.datavalue;
    const symptom4 = Page.Widgets.symptom4.datavalue;
    const symptom5 = Page.Widgets.symptom5.datavalue;

    // let matchingDiagnosis = [];
    let matchingDiagnosis = new Array();

    for (let i = 0; i < Page.Variables.Health_connectSymptomsData1.dataSet.length; i++) {
        const data = Page.Variables.Health_connectSymptomsData1.dataSet[i];
        if (
            [data.symptom1, data.symptom2, data.symptom3, data.symptom4, data.symptom5].some((column) => [symptom1, symptom2, symptom3, symptom4, symptom5].some((symptom) =>
                column.includes(symptom)
            ))
        ) {
            matchingDiagnosis.push(data.diagnosis);
        }
    }

    Page.Widgets.Diagnosis.dataset = matchingDiagnosis;
    Page.Widgets.label2_1.show = false;
    Page.Widgets.Diagnosis.show = true;

};