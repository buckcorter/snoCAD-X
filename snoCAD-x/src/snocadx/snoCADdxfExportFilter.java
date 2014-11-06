/*
 * Copyright 2007-2014 Daniel Graf (https://github.com/danielgraf)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * snoCADdxfExportFilter.java
 *
 * Created on 22 March 2009, 15:28
 */

package snocadx;

/**
 *
 * @author  dgraf
 */
public class snoCADdxfExportFilter extends javax.swing.JPanel {
    
    /** Creates new form snoCADdxfExportFilter */
    public snoCADdxfExportFilter() {
        initComponents();
    }

    public boolean getAlignmentHoles() {
        return alignmentHoles.isSelected();
    }

    public void setAlignmentHoles(boolean alignmentHoles) {
        this.alignmentHoles.setSelected(alignmentHoles);
    }

    public boolean getBaseProfile() {
        return baseProfile.isSelected();
    }

    public void setBaseProfile(boolean baseProfile) {
        this.baseProfile.setSelected(baseProfile);
    }

    public boolean getBoardOutline() {
        return boardOutline.isSelected();
    }

    public void setBoardOutline(boolean boardOutline) {
        this.boardOutline.setSelected(boardOutline);
    }

    public boolean getCoreOutline() {
        return coreOutline.isSelected();
    }

    public void setCoreOutline(boolean coreOutline) {
        this.coreOutline.setSelected(coreOutline);
    }

    public boolean getCoreProfile() {
        return coreProfile.isSelected();
    }

    public void setCoreProfile(boolean coreProfile) {
        this.coreProfile.setSelected(coreProfile);
    }

    public boolean getInserts() {
        return inserts.isSelected();
    }

    public void setInserts(boolean inserts) {
        this.inserts.setSelected(inserts);
    }

 
    public boolean getNoseIdentHole() {
        return noseIdentHole.isSelected();
    }

    public void setNoseIdentHole(boolean noseIdentHole) {
        this.noseIdentHole.setSelected(noseIdentHole);
    }

    public boolean getNoseTS() {
        return noseTS.isSelected();
    }

    public void setNoseTS(boolean noseTS) {
        this.noseTS.setSelected(noseTS);
    }

    public boolean getStanceLocators() {
        return stanceLocators.isSelected();
    }

    public void setStanceLocators(boolean stanceLocators) {
        this.stanceLocators.setSelected(stanceLocators);
    }

    public boolean getTailTS() {
        return tailTS.isSelected();
    }

    public void setTailTS(boolean tailTS) {
        this.tailTS.setSelected(tailTS);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        boardOutline = new javax.swing.JCheckBox();
        coreOutline = new javax.swing.JCheckBox();
        noseTS = new javax.swing.JCheckBox();
        tailTS = new javax.swing.JCheckBox();
        coreProfile = new javax.swing.JCheckBox();
        baseProfile = new javax.swing.JCheckBox();
        inserts = new javax.swing.JCheckBox();
        noseIdentHole = new javax.swing.JCheckBox();
        alignmentHoles = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        stanceLocators = new javax.swing.JCheckBox();

        boardOutline.setSelected(true);
        boardOutline.setText("Main Outline");
        boardOutline.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        boardOutline.setMargin(new java.awt.Insets(0, 0, 0, 0));

        coreOutline.setText("Core Outline");
        coreOutline.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        coreOutline.setMargin(new java.awt.Insets(0, 0, 0, 0));

        noseTS.setText("Nose Tipspacer");
        noseTS.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        noseTS.setMargin(new java.awt.Insets(0, 0, 0, 0));

        tailTS.setText("Tail Tipspacer");
        tailTS.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        tailTS.setMargin(new java.awt.Insets(0, 0, 0, 0));

        coreProfile.setText("Core Profile");
        coreProfile.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        coreProfile.setMargin(new java.awt.Insets(0, 0, 0, 0));

        baseProfile.setText("Base Profile");
        baseProfile.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        baseProfile.setMargin(new java.awt.Insets(0, 0, 0, 0));

        inserts.setSelected(true);
        inserts.setText("Inserts");
        inserts.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        inserts.setMargin(new java.awt.Insets(0, 0, 0, 0));

        noseIdentHole.setSelected(true);
        noseIdentHole.setText("Nose Identifier Hole (10mm)");
        noseIdentHole.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        noseIdentHole.setMargin(new java.awt.Insets(0, 0, 0, 0));

        alignmentHoles.setSelected(true);
        alignmentHoles.setText("Axis Alignment Holes (2mm)");
        alignmentHoles.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        alignmentHoles.setMargin(new java.awt.Insets(0, 0, 0, 0));

        stanceLocators.setText("Stance Locators (3mm)");
        stanceLocators.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        stanceLocators.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(boardOutline)
                            .add(coreOutline))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 126, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(noseIdentHole)
                            .add(alignmentHoles)
                            .add(stanceLocators))
                        .add(36, 36, 36))
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(noseTS)
                            .add(tailTS)
                            .add(coreProfile)
                            .add(baseProfile)
                            .add(inserts))
                        .addContainerGap(299, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(boardOutline)
                    .add(noseIdentHole))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(coreOutline)
                    .add(alignmentHoles))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 19, Short.MAX_VALUE)
                .add(stanceLocators)
                .add(15, 15, 15)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(noseTS)
                .add(21, 21, 21)
                .add(tailTS)
                .add(17, 17, 17)
                .add(coreProfile)
                .add(22, 22, 22)
                .add(baseProfile)
                .add(21, 21, 21)
                .add(inserts)
                .add(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alignmentHoles;
    private javax.swing.JCheckBox baseProfile;
    private javax.swing.JCheckBox boardOutline;
    private javax.swing.JCheckBox coreOutline;
    private javax.swing.JCheckBox coreProfile;
    private javax.swing.JCheckBox inserts;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox noseIdentHole;
    private javax.swing.JCheckBox noseTS;
    private javax.swing.JCheckBox stanceLocators;
    private javax.swing.JCheckBox tailTS;
    // End of variables declaration//GEN-END:variables
    
}