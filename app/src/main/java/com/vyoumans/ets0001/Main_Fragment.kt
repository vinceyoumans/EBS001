package com.vyoumans.ets0001


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Main_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_main_, container, false)

        view.findViewById<Button>(R.id.btn_D01_report_subject_01).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_main_Fragment_to_d01Log_Subject)
        }
        view.findViewById<Button>(R.id.btnD02_mission).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_main_Fragment_to_d02_missions)
        }

        view.findViewById<Button>(R.id.btn3_RequestMeds).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_main_Fragment_to_d03_requestMeds01)
        }



        return view

    }


}
