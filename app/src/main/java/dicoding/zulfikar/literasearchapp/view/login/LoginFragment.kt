package dicoding.zulfikar.literasearchapp.view.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dicoding.zulfikar.literasearchapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
        setupAction()
    }

    private fun setupAction() {
        with(binding) {
            binding.button2.setOnClickListener {
                val mover = LoginFragmentDirections.actionLoginFragmentToBookFragment2()
                findNavController().navigate(mover)
            }
            binding.textView6.setOnClickListener {
                val mover = LoginFragmentDirections.actionLoginFragmentToRegisterFragment()
                findNavController().navigate(mover)
            }
            binding.textView7.setOnClickListener {
                val mover = LoginFragmentDirections.actionLoginFragmentToForgotPasswordFragment()
                findNavController().navigate(mover)
            }
        }
    }
}