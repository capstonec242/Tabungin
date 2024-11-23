package com.example.ones.ui.settings

import android.content.res.Resources.Theme
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ones.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

    private var _binding: FragmentSettingsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(SettingsViewModel::class.java)

        _binding = FragmentSettingsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val editProfileTextView = binding.tvEditProfile
        editProfileTextView.setOnClickListener {
            Toast.makeText(context, "Edit Profile clicked", Toast.LENGTH_SHORT).show()

        }

        val themeTextView = binding.tvTema
        themeTextView.setOnClickListener {
            Toast.makeText(context, "test thema", Toast.LENGTH_SHORT).show()

        }

        val languageTextView = binding.tvLanguage
        languageTextView.setOnClickListener {
            Toast.makeText(context, "test language nya", Toast.LENGTH_SHORT).show()

        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}