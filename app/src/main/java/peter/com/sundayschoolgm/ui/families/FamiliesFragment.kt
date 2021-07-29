package peter.com.sundayschoolgm.ui

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import peter.com.sundayschoolgm.R
import peter.com.sundayschoolgm.databinding.FragmentFamiliesBinding


class FamiliesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentFamiliesBinding.inflate(inflater)
        binding.fabAdd.setOnClickListener {
            this.findNavController()
                .navigate(FamiliesFragmentDirections.actionFamiliesFragmentToAddFamilyFragment())
//      AddDialogFragment().show( childFragmentManager, AddDialogFragment.TAG)
        }
        return binding.root
    }


}

class AddDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(requireContext())
            .setMessage("Dialog Message")
            .setPositiveButton(getString(R.string.ok)) { _,_ -> }
            .create()

    companion object {
        const val TAG = "PurchaseConfirmationDialog"
    }
}