/*
 * Copyright (c) 2020, Gyuri Grell and RxReactor contributors. All rights reserved
 *
 * Licensed under BSD 3-Clause License.
 * https://opensource.org/licenses/BSD-3-Clause
 */

package com.gyurigrell.rxreactor3

import io.reactivex.rxjava3.disposables.CompositeDisposable

/**
 * Do not let me check this in without adding a comment about the class.
 */
interface ReactorView<Action, Mutation, State> {
    var disposeBag: CompositeDisposable

    var reactor: Reactor<Action, Mutation, State>?

    fun bind(reactor: Reactor<Action, Mutation, State>)
}

fun <Action, Mutation, State> ReactorView<Action, Mutation, State>.attachReactor(reactor: Reactor<Action, Mutation, State>) {
    this.reactor = reactor
    this.bind(reactor)
}
