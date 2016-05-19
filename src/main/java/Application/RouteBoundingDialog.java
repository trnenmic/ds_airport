package Application;

import Service.RelationService;
import Application.GUIDesigners.Utils;
import Model.Airplane;
import Model.Route;
import Service.ManagementProvider;
import static javax.swing.ListSelectionModel.SINGLE_SELECTION;

/**
 *
 * @author M
 */
public class RouteBoundingDialog extends javax.swing.JDialog {

    private ManagementProvider mgProvider;
    private Object detached = null;
    private RelationService boundingUpdater;

    private String filterCode = null;
    private String filterAirline = null;
    private Integer filterMaxPassengerCapacity = null;
    private Integer filterMinPassengerCapacity = null;
    private Integer filterMaxMaximumRange = null;
    private Integer filterMinMaximumRange = null;

    public RouteBoundingDialog(java.awt.Frame parent, boolean modal, ManagementProvider managementProvider, Object o, RelationService boundingUpdater) {
        super(parent, modal);
        detached = o;
        this.boundingUpdater = boundingUpdater;
        initDialog(managementProvider);
    }

    private void initDialog(ManagementProvider managementProvider) {
        mgProvider = managementProvider;
        initComponents();
        setLocationRelativeTo(null);
        initLists();
    }

    private void initLists() {
        filteredAirplanesList.setSelectionMode(SINGLE_SELECTION);
        currentAirplanesList.setSelectionMode(SINGLE_SELECTION);
        updateLists();
    }

    private void updateLists() {
        updateFiltered();
        updateCurrent();
    }

    private void updateFiltered() {
        filteredAirplanesList.setListData(mgProvider.getAirplaneManager().findSpecified(
                filterCode, filterAirline,
                filterMaxPassengerCapacity, filterMinPassengerCapacity,
                filterMaxMaximumRange, filterMinMaximumRange).toArray());
    }

    private void updateCurrent() {
        currentAirplanesList.setListData(((Route) detached).getAirplanes().toArray());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        filteredAirplanesScrollPane = new javax.swing.JScrollPane();
        filteredAirplanesList = new javax.swing.JList();
        addBoudningToRouteButton = new javax.swing.JButton();
        airplaneFilterLabel = new javax.swing.JLabel();
        airplaneCodeLabel = new javax.swing.JLabel();
        airplaneCodeTextField = new javax.swing.JTextField();
        airplaneFuelGreaterLabel = new javax.swing.JLabel();
        airplanePassengerGreaterTextField = new javax.swing.JTextField();
        airplaneFuelLesserLabel = new javax.swing.JLabel();
        airplanePassengerLesserTextField = new javax.swing.JTextField();
        airplaneLoadingLesserLabel = new javax.swing.JLabel();
        airplaneRangeLesserTextField = new javax.swing.JTextField();
        airplaneRangeGreaterTextField = new javax.swing.JTextField();
        airplaneLoadingGreaterLabel = new javax.swing.JLabel();
        airplaneAirlineLabel = new javax.swing.JLabel();
        airplaneAirlineTextField = new javax.swing.JTextField();
        applyFilterButton = new javax.swing.JButton();
        currentAirplanesScrollPane = new javax.swing.JScrollPane();
        currentAirplanesList = new javax.swing.JList();
        deleteRouteBoundingButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Airplanes on selected Route");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        filteredAirplanesList.setBackground(new java.awt.Color(52, 52, 56));
        filteredAirplanesList.setForeground(new java.awt.Color(255, 255, 255));
        filteredAirplanesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        filteredAirplanesScrollPane.setViewportView(filteredAirplanesList);

        addBoudningToRouteButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        addBoudningToRouteButton.setText("Add selected Airplane");
        addBoudningToRouteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBoudningToRouteButtonActionPerformed(evt);
            }
        });

        airplaneFilterLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        airplaneFilterLabel.setText("Filter settings for Airplane:");

        airplaneCodeLabel.setText("Code:");

        airplaneCodeTextField.setBackground(new java.awt.Color(52, 52, 56));
        airplaneCodeTextField.setForeground(new java.awt.Color(255, 255, 255));

        airplaneFuelGreaterLabel.setText("Fuel capacity greater than:");

        airplanePassengerGreaterTextField.setBackground(new java.awt.Color(52, 52, 56));
        airplanePassengerGreaterTextField.setForeground(new java.awt.Color(255, 255, 255));

        airplaneFuelLesserLabel.setText("Fuel capacity lesser than:");

        airplanePassengerLesserTextField.setBackground(new java.awt.Color(52, 52, 56));
        airplanePassengerLesserTextField.setForeground(new java.awt.Color(255, 255, 255));

        airplaneLoadingLesserLabel.setText("Loading capacity lesser than:");

        airplaneRangeLesserTextField.setBackground(new java.awt.Color(52, 52, 56));
        airplaneRangeLesserTextField.setForeground(new java.awt.Color(255, 255, 255));

        airplaneRangeGreaterTextField.setBackground(new java.awt.Color(52, 52, 56));
        airplaneRangeGreaterTextField.setForeground(new java.awt.Color(255, 255, 255));

        airplaneLoadingGreaterLabel.setText("Loading capacity greater than:");

        airplaneAirlineLabel.setText("Airline:");

        airplaneAirlineTextField.setBackground(new java.awt.Color(52, 52, 56));
        airplaneAirlineTextField.setForeground(new java.awt.Color(255, 255, 255));

        applyFilterButton.setBackground(new java.awt.Color(204, 204, 204));
        applyFilterButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        applyFilterButton.setForeground(new java.awt.Color(0, 51, 102));
        applyFilterButton.setText("Apply Filter");
        applyFilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyFilterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(airplaneFuelGreaterLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(airplaneFuelLesserLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(airplanePassengerLesserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(airplanePassengerGreaterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(airplaneFilterLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(airplaneCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(airplaneCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(airplaneAirlineLabel)
                                .addGap(31, 31, 31)
                                .addComponent(airplaneAirlineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(airplaneLoadingGreaterLabel)
                                    .addComponent(airplaneLoadingLesserLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(airplaneRangeLesserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(airplaneRangeGreaterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(filteredAirplanesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(applyFilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addBoudningToRouteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addBoudningToRouteButton, applyFilterButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(airplaneFilterLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(airplaneCodeLabel)
                            .addComponent(airplaneCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(airplanePassengerGreaterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(airplaneFuelGreaterLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(airplanePassengerLesserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(airplaneFuelLesserLabel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(airplaneAirlineLabel)
                            .addComponent(airplaneAirlineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(airplaneLoadingGreaterLabel)
                            .addComponent(airplaneRangeGreaterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(airplaneLoadingLesserLabel)
                            .addComponent(airplaneRangeLesserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(filteredAirplanesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addBoudningToRouteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(applyFilterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        currentAirplanesList.setBackground(new java.awt.Color(52, 52, 56));
        currentAirplanesList.setForeground(new java.awt.Color(255, 255, 255));
        currentAirplanesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        currentAirplanesScrollPane.setViewportView(currentAirplanesList);

        deleteRouteBoundingButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deleteRouteBoundingButton.setForeground(new java.awt.Color(153, 0, 0));
        deleteRouteBoundingButton.setText("Delete selected Airplane");
        deleteRouteBoundingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRouteBoundingButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Current Airplanes for Route");

        warningLabel.setForeground(new java.awt.Color(204, 0, 0));
        warningLabel.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(warningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(266, 266, 266)
                                    .addComponent(deleteRouteBoundingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(currentAirplanesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentAirplanesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteRouteBoundingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warningLabel)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteRouteBoundingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRouteBoundingButtonActionPerformed
        warningLabel.setText(" ");
        if (currentAirplanesList.getSelectedValue() != null) {
            Route route = (Route) detached;
            Airplane airplane = (Airplane) currentAirplanesList.getSelectedValue();
            airplane.getRoutes().remove(route);
            route.getAirplanes().remove(airplane);
            boundingUpdater.addAirplane(airplane);
        }
        updateCurrent();
    }//GEN-LAST:event_deleteRouteBoundingButtonActionPerformed

    private void applyFilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyFilterButtonActionPerformed
        warningLabel.setText(" ");
        try {
            filterCode = Utils.emptyStringToNull(airplaneCodeTextField);
            filterAirline = Utils.emptyStringToNull(airplaneAirlineTextField);
            filterMaxPassengerCapacity = Utils.emptyStringToNullConvert(airplanePassengerGreaterTextField);
            filterMinPassengerCapacity = Utils.emptyStringToNullConvert(airplanePassengerLesserTextField);
            filterMaxMaximumRange = Utils.emptyStringToNullConvert(airplaneRangeGreaterTextField);
            filterMinMaximumRange = Utils.emptyStringToNullConvert(airplaneRangeLesserTextField);
            updateLists();
        } catch (NumberFormatException e) {
            warningLabel.setText("Input is not and integer.");
        }

    }//GEN-LAST:event_applyFilterButtonActionPerformed

    private void addBoudningToRouteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBoudningToRouteButtonActionPerformed
        warningLabel.setText(" ");
        if (filteredAirplanesList.getSelectedValue() != null) {
            Route route = (Route) detached;
            Airplane airplane = (Airplane) filteredAirplanesList.getSelectedValue();
            route.addAirplane(airplane);
            airplane.addRoute(route);
            boundingUpdater.addAirplane(airplane);
            boundingUpdater.addRoute(route);
        }
        updateCurrent();
    }//GEN-LAST:event_addBoudningToRouteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBoudningToRouteButton;
    private javax.swing.JLabel airplaneAirlineLabel;
    private javax.swing.JTextField airplaneAirlineTextField;
    private javax.swing.JLabel airplaneCodeLabel;
    private javax.swing.JTextField airplaneCodeTextField;
    private javax.swing.JLabel airplaneFilterLabel;
    private javax.swing.JLabel airplaneFuelGreaterLabel;
    private javax.swing.JLabel airplaneFuelLesserLabel;
    private javax.swing.JLabel airplaneLoadingGreaterLabel;
    private javax.swing.JLabel airplaneLoadingLesserLabel;
    private javax.swing.JTextField airplanePassengerGreaterTextField;
    private javax.swing.JTextField airplanePassengerLesserTextField;
    private javax.swing.JTextField airplaneRangeGreaterTextField;
    private javax.swing.JTextField airplaneRangeLesserTextField;
    private javax.swing.JButton applyFilterButton;
    private javax.swing.JList currentAirplanesList;
    private javax.swing.JScrollPane currentAirplanesScrollPane;
    private javax.swing.JButton deleteRouteBoundingButton;
    private javax.swing.JList filteredAirplanesList;
    private javax.swing.JScrollPane filteredAirplanesScrollPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
