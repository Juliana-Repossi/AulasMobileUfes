import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData


class MainViewModel : ViewModel() {

    private var textTop = MutableLiveData<String>()

    fun titleTop(): LiveData<String> {
        return textTop
    }



}
