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


function day(date) {
    const dayofweek = ['sunday', 'monday', 'tuesday', 'wednesday', 'thursday', 'friday', 'saturday'];
    const dayIndex = date.getday();
    return day(dayIndex);

}

Page.button3Click = function($event, widget) {
    const date = Page.Widgets.AppointmentsLiveForm1.formWidgets.appointmentDate.datavalue;
    const status = Page.Widgets.AppointmentsLiveForm1.formWidgets.appointmentStatus.datavalue;
    const time = Page.Widgets.AppointmentsLiveForm1.formWidgets.timeslots.datavalue.id;
    const patientid = Page.App.Variables.LoggedGetbyemail.dataSet.id;
    const doctorid = Page.Widgets.AppointmentsLiveForm1.formWidgets.doctors.datavalue.id;

    const appointments = Page.Variables.svAppointments.dataSet;
    let existingAppointment = null;
    for (let i = 0; i < appointments.length; i++) {
        if (appointments[i].patientId === patientid && appointments[i].doctorId === doctorid) {
            existingAppointment = appointments[i];
            break;
        }
    }
    if (existingAppointment) {
        Page.Widgets.label10.show = true;
        return;
    }

};