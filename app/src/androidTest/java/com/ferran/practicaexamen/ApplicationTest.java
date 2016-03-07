package com.ferran.practicaexamen;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;





public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private Button login;

    private MainActivity actividad;

    public ApplicationTest() {
//		super("com.example.calc", MainActivity.class);
        super(MainActivity.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();
        login = (Button) actividad.findViewById(R.id.loginButton);

    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    private static final String USER = "Ferran";
    private static final String PASSWORD = "0 0 0 0";

    public void testLogin() {


         TouchUtils.clickView(this, login);


    }


}