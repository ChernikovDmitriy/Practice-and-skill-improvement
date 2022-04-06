package com.JAVA;

class RecordStudio {
        String label;
        String owner;
        int foundationYear;
        int records;

        public RecordStudio(String label, String owner, int foundationYear, int records) {
            this.label = label;
            this.owner = owner;
            this.foundationYear = foundationYear;
            this.records = records;
        }

        void makeNewRecord() {
            records++;
        }

    }


