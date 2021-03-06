package com.dobi.walkingsynth.di;

import android.hardware.SensorManager;

import com.dobi.walkingsynth.model.musicgeneration.core.AudioPlayer;
import com.dobi.walkingsynth.model.stepdetection.AccelerometerManager;
import com.dobi.walkingsynth.model.stepdetection.StepDetector;
import com.dobi.walkingsynth.view.GraphView;
import com.dobi.walkingsynth.view.impl.AchartEngineGraphView;

import dagger.Module;
import dagger.Provides;

@Module
public class AccelerometerModule {

    @Provides
    @MainApplicationScope
    StepDetector providesStepDetector() {
        return new StepDetector();
    }

    @Provides
    @MainApplicationScope
    GraphView providesAchartEngineAccelerometerGraph() {
        return new AchartEngineGraphView();
    }

    @Provides
    @MainApplicationScope
    AccelerometerManager providesAccelerometerManager(SensorManager sensorManager,
                                                      GraphView accelerometerGraph,
                                                      StepDetector stepDetector,
                                                      AudioPlayer audioPlayer) {
        return new AccelerometerManager(sensorManager, accelerometerGraph, stepDetector, audioPlayer);
    }
}
