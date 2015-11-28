package com.liaolushen.interfaces;

/**
 * Created by liaolushen on 11/28/15.
 *
 * @author liaolushen
 */

interface Cycle {
    int wheelNumber();
}

interface CycleFactory {
    Cycle getCycle();
}

class UnicycleFactory implements CycleFactory {
    UnicycleFactory() {
    }

    public Cycle getCycle() {
        return new Cycle() {
            public int wheelNumber() {
                return 1;
            }
        };
    }
}

class BicycleFactory implements CycleFactory {
    BicycleFactory() {
    }

    public Cycle getCycle() {
        return new Cycle() {
            public int wheelNumber() {
                return 2;
            }
        };
    }
}

class TricycleFactory implements CycleFactory {
    TricycleFactory() {
    }

    public Cycle getCycle() {
        return new Cycle() {
            public int wheelNumber() {
                return 3;
            }
        };
    }
}

public class E16_CycleFactories {
    public E16_CycleFactories() {
    }

    public static void ride(CycleFactory factory) {
        System.out.println("I like ride " + factory.getCycle().wheelNumber() + " wheels cycle.");
    }

    public static void main(String[] args) {
        ride(new UnicycleFactory());
        ride(new BicycleFactory());
        ride(new TricycleFactory());
    }
}