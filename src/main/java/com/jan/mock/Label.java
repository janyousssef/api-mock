package com.jan.mock;

public enum Label {
    viralpneumonia, bacterialpneumonia, normal, covid;

    @Override
    public String toString() {
        String strName = super.toString();
        return strName.contains("pneumonia") ?
                strName.substring(0, strName.indexOf("pneumonia")) + " pneumonia" : strName;
    }
}
