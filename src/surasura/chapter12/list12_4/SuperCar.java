package surasura.chapter12.list12_4;

class SuperCar extends Car {
    @Override
    int getMaxPerson() {
        /* スーパーカーには2人しか乗れない */
        return 2;
    }
}
