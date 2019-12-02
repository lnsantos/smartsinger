package com.donpeno.smartsinger.main.mvvm.lifecyclers.activitys;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;
import java.lang.Override;

public class MainLifecyclerObserver_LifecycleAdapter implements GeneratedAdapter {
  final MainLifecyclerObserver mReceiver;

  MainLifecyclerObserver_LifecycleAdapter(MainLifecyclerObserver receiver) {
    this.mReceiver = receiver;
  }

  @Override
  public void callMethods(LifecycleOwner owner, Lifecycle.Event event, boolean onAny,
      MethodCallsLogger logger) {
    boolean hasLogger = logger != null;
    if (onAny) {
      return;
    }
    if (event == Lifecycle.Event.ON_START) {
      if (!hasLogger || logger.approveCall("onStartListener", 1)) {
        mReceiver.onStartListener();
      }
      return;
    }
    if (event == Lifecycle.Event.ON_STOP) {
      if (!hasLogger || logger.approveCall("onStopListener", 1)) {
        mReceiver.onStopListener();
      }
      return;
    }
    if (event == Lifecycle.Event.ON_RESUME) {
      if (!hasLogger || logger.approveCall("onResumeListener", 1)) {
        mReceiver.onResumeListener();
      }
      return;
    }
    if (event == Lifecycle.Event.ON_PAUSE) {
      if (!hasLogger || logger.approveCall("onPauseListener", 1)) {
        mReceiver.onPauseListener();
      }
      return;
    }
    if (event == Lifecycle.Event.ON_DESTROY) {
      if (!hasLogger || logger.approveCall("onDestroyListener", 1)) {
        mReceiver.onDestroyListener();
      }
      return;
    }
  }
}
