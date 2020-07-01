package com.example.currtal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import static androidx.core.content.ContextCompat.getSystemService;

public class editBTNkeyboard {
    private EditText txtUsername;
    public void changeKeyboardState(View view) {
        InputMethodManager imm = getSystemService(this, InputMethodManager.class);
        imm.showSoftInput(txtUsername, InputMethodManager.SHOW_FORCED);
    }
}





