package com.independentsoft.exchange;

import java.util.*;

public class ExtendedPropertyList extends ArrayList<ExtendedProperty>
{
    public ExtendedProperty get(final ExtendedPropertyPath propertyPath) {
        for (int i = 0; i < this.size(); ++i) {
            if (this.get(i) != null && this.get(i).getPropertyPath() != null && this.get(i).getPropertyPath().isEqual(propertyPath)) {
                return this.get(i);
            }
        }
        return null;
    }
}
