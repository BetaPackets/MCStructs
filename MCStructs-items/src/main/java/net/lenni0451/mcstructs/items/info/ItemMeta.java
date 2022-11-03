package net.lenni0451.mcstructs.items.info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemMeta {

    public static final ItemMeta EMPTY = new ItemMeta() {
        private final String exceptionMessage = "Unable to modify empty item meta";

        @Override
        public ItemMeta types(ItemType... types) {
            throw new UnsupportedOperationException(this.exceptionMessage);
        }

        @Override
        public ItemMeta maxCount(int maxStackSize) {
            throw new UnsupportedOperationException(this.exceptionMessage);
        }

        @Override
        public ItemMeta maxDamage(int maxDamage) {
            throw new UnsupportedOperationException(this.exceptionMessage);
        }

        @Override
        public ItemMeta damageable(boolean damageable) {
            throw new UnsupportedOperationException(this.exceptionMessage);
        }

        @Override
        public ItemMeta hasSubtypes(boolean hasSubtypes) {
            throw new UnsupportedOperationException(this.exceptionMessage);
        }
    };


    private List<ItemType> types = new ArrayList<>();
    private int maxCount = 64;
    private int maxDamage = 0;
    private boolean damageable = false;
    private boolean hasSubtypes = false;

    public ItemMeta() {
        this.types.add(ItemType.GENERIC);
    }

    public List<ItemType> types() {
        return this.types;
    }

    public ItemMeta types(final ItemType... types) {
        Collections.addAll(this.types, types);
        return this;
    }

    public int maxCount() {
        return this.maxCount;
    }

    public ItemMeta maxCount(final int maxStackSize) {
        this.maxCount = maxStackSize;
        return this;
    }

    public int maxDamage() {
        return this.maxDamage;
    }

    public ItemMeta maxDamage(final int maxDamage) {
        this.maxDamage = maxDamage;
        return this;
    }

    public boolean damageable() {
        return this.damageable;
    }

    public ItemMeta damageable(final boolean damageable) {
        this.damageable = damageable;
        return this;
    }

    public boolean hasSubtypes() {
        return this.hasSubtypes;
    }

    public ItemMeta hasSubtypes(final boolean hasSubtypes) {
        this.hasSubtypes = hasSubtypes;
        return this;
    }

}
