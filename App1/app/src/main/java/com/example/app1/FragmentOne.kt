package com.example.app1

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.app1.databinding.FragmentOneBinding


class FragmentOne : Fragment() {
    private var _binding: FragmentOneBinding? = null
    private val binding get() = _binding!!

    interface OnDataPassListener {
        fun onDataPass(data: String?)
    }

    lateinit var dataPassListener: OnDataPassListener

    override fun onAttach(context: Context) {
        Log.d("life_cycle", "F onAttach")
        super.onAttach(context)
        dataPassListener = context as OnDataPassListener
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("life_cycle", "F onCreate")
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        프래그먼트가 인터페이스를 처음으로 그릴 때 호출된다.
//        inflater -> 뷰를 그려주는 역할
//        container -> 부모 뷰
        Log.d("life_cycle", "F onCreateView")

        _binding = FragmentOneBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("life_cycle", "F onViewCreated")
        super.onViewCreated(view, savedInstanceState)


        // Activity의 OnCreate에서 했던 작업을 여기서 한다
        binding.pass.setOnClickListener {
            Log.d("button", "button tapped")
            dataPassListener.onDataPass("Good bye")
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("life_cycle", "F onActivityCreated")

        val data = arguments?.getString("hello")
        Log.d("data", data!!)

        super.onActivityCreated(savedInstanceState)
        //fragment에서 액티비티에서 데이터 보내는거는 시스템에서 제공 안함
    }

    override fun onStart() {
        Log.d("life_cycle", "F onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("life_cycle", "F onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("life_cycle", "F onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("life_cycle", "F onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("life_cycle", "F onDestroyView")
        super.onDestroyView()
        _binding = null
    }

    override fun onDetach() {
        Log.d("life_cycle", "F onDetach")
        super.onDetach()
    }
}