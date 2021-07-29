package peter.com.sundayschoolgm.ui.add_family

import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.util.Log
import android.util.Patterns
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import peter.com.sundayschoolgm.pojo.Family


class AddFamilyViewModel : ViewModel() {
    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    enum class ApiStatus { LOADING, ERROR, DONE }

    private var _family = MutableLiveData<Family>()
    val family: LiveData<Family>
        get() = _family

    private val _status = MutableLiveData<ApiStatus>()
    val status: LiveData<ApiStatus>
        get() = _status

    private val _show = MutableLiveData<Boolean>()
    val show: LiveData<Boolean>
        get() = _show
init {
    _family.value?.name ?:  "qqq"
}
    fun onAddClicked() {
//        Log.i("NAME", _family.value!!.name)
        _show.value = true
    }

    fun nameWatcher(): TextWatcher? {
        return object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                _family.value?.name = charSequence.toString()
            }

            override fun afterTextChanged(editable: Editable) {
            }
        }
    }
}