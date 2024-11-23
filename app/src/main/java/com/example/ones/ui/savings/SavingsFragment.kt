package com.example.ones.ui.savings

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ones.databinding.FragmentSavingsBinding

class SavingsFragment : Fragment() {

    private var _binding: FragmentSavingsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val savingsViewModel =
            ViewModelProvider(this).get(SavingsViewModel::class.java)

        _binding = FragmentSavingsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.fab.setOnClickListener {
            Log.d("SavingsFragment", "FAB clicked")
                Toast.makeText(context, "test saving nya", Toast.LENGTH_SHORT).show()


        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}