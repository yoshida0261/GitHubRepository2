package com.stah.githubrepository.presentation.presentor

import com.stah.githubrepository.infra.repository.MixiRepositoryImpl
import io.reactivex.disposables.CompositeDisposable


class MainPresentor(private val repository: MixiRepositoryImpl){
    private val disposables = CompositeDisposable()

    fun getMixiRepository(){
        repository.findAllByPage(100)
            // TODO  repositoryのデータをviewに返す
    }

    fun dispose(){
        disposables.dispose()
    }
}