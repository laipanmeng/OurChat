package com.lpm_wxl.common.base;

import android.app.Application;

import com.trello.rxlifecycle2.LifecycleProvider;

import java.lang.ref.WeakReference;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class BaseViewModel <M extends BaseModel> extends AndroidViewModel implements IBaseViewModel , Consumer<Disposable> {

    protected M model;
    //弱引用持有
    private WeakReference<LifecycleProvider> lifecycle;
    //管理RxJava，主要针对RxJava异步操作造成的内存泄漏
    private CompositeDisposable mCompositeDisposable;


    public BaseViewModel(@NonNull Application application) {
        super(application);
    }

    public BaseViewModel(@NonNull Application application, M model) {
        super(application);
        this.model = model;
        mCompositeDisposable = new CompositeDisposable();
    }

    protected void addSubscribe(Disposable disposable) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(disposable);
    }


    /**
     * 注入RxLifecycle生命周期
     *
     * @param lifecycle
     */
    public void injectLifecycleProvider(LifecycleProvider lifecycle) {
        this.lifecycle = new WeakReference<>(lifecycle);
    }

    public LifecycleProvider getLifecycleProvider() {
        return lifecycle.get();
    }

    @Override
    public void accept(Disposable disposable) throws Exception {
        addSubscribe(disposable);
    }
    @Override
    public void onAny(LifecycleOwner owner, Lifecycle.Event event) {

    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (model != null) {
            model.onCleared();
        }
        //ViewModel销毁时会执行，同时取消所有异步任务
        if (mCompositeDisposable != null) {
            mCompositeDisposable.clear();
        }
    }
}
