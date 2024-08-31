@file:Suppress("UNREACHABLE_CODE")

package com.hedroid.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment


class BlankFragment : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("TAG","onAttach:View Created")
        Toast.makeText(requireContext(),"onAttach",Toast.LENGTH_SHORT).show()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TAG","onCreate:View Created")
        Toast.makeText(requireContext(),"onCreate",Toast.LENGTH_SHORT).show()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)

        Log.d("TAG","onCreateView:View Created")
        Toast.makeText(requireContext(),"onCreateView",Toast.LENGTH_SHORT).show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TAG","onViewCreated:View Created")
        Toast.makeText(requireContext(),"onViewCreated",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG","onResume:View Created")
        Toast.makeText(requireContext(),"onResume",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","onPause:View Created")
        Toast.makeText(requireContext(),"onPause",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG","onStop:View Created")
        Toast.makeText(requireContext(),"onStop",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG","onDestroy:View Created")
        Toast.makeText(requireContext(),"onDestroy",Toast.LENGTH_SHORT).show()
    }


}