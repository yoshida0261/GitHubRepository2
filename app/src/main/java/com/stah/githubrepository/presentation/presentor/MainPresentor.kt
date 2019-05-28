package com.stah.githubrepository.presentation.presentor

import android.util.Log
import com.stah.githubrepository.domain.entity.Repository
import com.stah.githubrepository.infra.repository.MixiRepositoryImpl
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers


class MainPresentor(private val contract: Contract, private val repository: MixiRepositoryImpl) {
    private val disposables = CompositeDisposable()

    fun getMixiRepository() {
        val disposable = repository.findAll()
            .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { contract.showRepository(it) },
                { Log.e("repos", "#getContributors") }
            ).addTo(disposables)
    }

    fun dispose() {
        disposables.dispose()
    }

    interface Contract {
        fun showRepository(contributors: List<Repository>)
    }
}


fun Disposable.addTo(compositeDisposable: CompositeDisposable) {
    compositeDisposable.add(this)
}
