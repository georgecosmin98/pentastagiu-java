public class GenericManager<T> {

    T[] objects;

    private final Class<T> tClass;

    public GenericManager(Class<T> genericClass) {
        tClass = genericClass;
        objects = (T[]) java.lang.reflect.Array.newInstance(tClass, 0);
    }


    public void add(T genericArg) {
        int newLength = objects.length + 1;
        T[] aux = (T[]) java.lang.reflect.Array.newInstance(tClass, newLength);
        int index = 0;
        for (T c : objects) {
            aux[index++] = c;
        }
        aux[index] = genericArg;
        this.objects = (T[]) java.lang.reflect.Array.newInstance(tClass, newLength);
        System.arraycopy(aux, 0, objects, 0,
                newLength);
    }


    public void delete(T genericArg) {
        T[] aux = (T[]) java.lang.reflect.Array.newInstance(tClass, objects.length);
        int index = 0;
        for (T c : objects) {
            try {
                if (!genericArg.equals(c)) {
                    aux[index++] = c;
                }

            } catch (Exception e) {
                System.out.println("Cursul nu exista in lista!");
            }
        }
        this.objects = (T[]) java.lang.reflect.Array.newInstance(tClass, index);
        System.arraycopy(aux, 0, objects, 0, index);

    }

    public void update(T oldGenericArg, T newGenericArg) {
        T[] aux = (T[]) java.lang.reflect.Array.newInstance(tClass, objects.length);
        int index = 0;
        for (T c : objects) {
            if (oldGenericArg != objects[index]) {
                aux[index++] = c;

            } else {
                aux[index++] = newGenericArg;
            }
        }
        this.objects = (T[]) java.lang.reflect.Array.newInstance(tClass, index);
        System.arraycopy(aux, 0, objects, 0, index
        );
    }

    public void read() {
        for (T c : objects) {
            System.out.println(c);
        }
    }

}
