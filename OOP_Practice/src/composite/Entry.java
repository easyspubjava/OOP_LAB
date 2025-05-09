package composite;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    public void printList() {                                       // �϶��� ǥ���Ѵ�.
        printList("");
    }
    protected abstract void printList(String prefix);
    public String toString() {                                      // ���ڿ� ǥ��
        return getName() + " (" + getSize() + ")";
    }
}
