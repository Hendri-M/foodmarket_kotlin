package com.tutor.foodmarketkotlin.ui.auth.signin

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.tutor.foodmarketkotlin.R
import com.tutor.foodmarketkotlin.ui.auth.AuthActivity

class SigninFragment : Fragment() {

    lateinit var btnSignIn : Button
    lateinit var btnSignUp : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnSignIn = view.findViewById(R.id.btn_signIn)
        btnSignUp = view.findViewById(R.id.btn_signUp)

        btnSignUp.setOnClickListener {
            val signUp = Intent(activity, AuthActivity::class.java)
            signUp.putExtra("page_request", 2)
            startActivity(signUp)
        }
    }

}