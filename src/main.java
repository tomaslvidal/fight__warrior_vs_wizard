import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class main {

	private JFrame frame;
	private JTextField nameChampion;
	private JTextField mpskill_1;
	private JTextField hp_2;
	private JTextField mp_2;
	private JTextField dps_2;
	private JTextField skill_2;
	private JTextField mpskill_2;
	private JButton btnNewButton_1;
	private JTextField hp_1;
	private JTextField mp_1;
	private JTextField dps_1;
	private JTextField skill_1;
	private JLabel player;
	private JLabel player_2;
	private wizard mago;
	private warrior guerrero;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 592, 683);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		nameChampion = new JTextField();
		nameChampion.setBounds(20, 25, 194, 20);
		frame.getContentPane().add(nameChampion);
		nameChampion.setColumns(10);

		JButton btnMago = new JButton("Mago");

		btnMago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mago=new wizard(nameChampion.getText());
				String dhp = String.valueOf(mago.getHp());
				hp_1.setText(dhp);
				String dmp = String.valueOf(mago.getMp());
				mp_1.setText(dmp);
				String dskill = String.valueOf(mago.getHabilidad().getDh());
				skill_1.setText(dskill);
				String ddps= String.valueOf(mago.getDp());
				dps_1.setText(ddps);
				String mmps= String.valueOf(mago.getHabilidad().getMp());
				mpskill_1.setText(mmps);

				player.setText(mago.getNombre());





			}
		});
		btnMago.setBounds(258, 19, 113, 33);
		frame.getContentPane().add(btnMago);

		JButton btnNewButton = new JButton("Guerrero");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guerrero=new warrior(nameChampion.getText());
				String dhp = String.valueOf(guerrero.getHp());
				hp_2.setText(dhp);
				String dmp = String.valueOf(guerrero.getMp());
				mp_2.setText(dmp);
				String dskill = String.valueOf(guerrero.getHabilidad().getDh());
				skill_2.setText(dskill);
				String ddps= String.valueOf(guerrero.getDp());
				dps_2.setText(ddps);
				String mmps= String.valueOf(guerrero.getHabilidad().getMp());
				mpskill_2.setText(mmps);
				player_2.setText(guerrero.getNombre());

			}
		});
		btnNewButton.setBounds(423, 19, 113, 33);
		frame.getContentPane().add(btnNewButton);

		JSeparator separator = new JSeparator();
		separator.setBounds(30, 76, 533, 20);
		frame.getContentPane().add(separator);

		player = new JLabel("Player 1");
		player.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		player.setBounds(20, 83, 81, 33);
		frame.getContentPane().add(player);

		player_2 = new JLabel("Player 2");
		player_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		player_2.setBounds(445, 92, 74, 14);
		frame.getContentPane().add(player_2);

		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(281, 73, 25, 260);
		frame.getContentPane().add(separator_1);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(main.class.getResource("warrior.png")));
		lblNewLabel_1.setBounds(30, 127, 216, 191);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(main.class.getResource("wizard.png")));
		lblNewLabel_2.setBounds(316, 117, 203, 204);
		frame.getContentPane().add(lblNewLabel_2);

		hp_1 = new JTextField();
		hp_1.setBounds(63, 366, 54, 20);
		frame.getContentPane().add(hp_1);
		hp_1.setColumns(10);


		dps_1 = new JTextField();
		dps_1.setColumns(10);
		dps_1.setBounds(192, 366, 54, 20);
		frame.getContentPane().add(dps_1);

		mp_1 = new JTextField();
		mp_1.setColumns(10);
		mp_1.setBounds(63, 413, 54, 20);
		frame.getContentPane().add(mp_1);

		skill_1 = new JTextField();
		skill_1.setColumns(10);
		skill_1.setBounds(192, 413, 54, 20);
		frame.getContentPane().add(skill_1);

		JLabel lblHp = new JLabel("HP");
		lblHp.setBounds(30, 369, 28, 14);
		frame.getContentPane().add(lblHp);

		JLabel lblMp = new JLabel("MP");
		lblMp.setBounds(33, 416, 25, 14);
		frame.getContentPane().add(lblMp);

		JLabel lblDps = new JLabel("DPS");
		lblDps.setBounds(160, 369, 30, 14);
		frame.getContentPane().add(lblDps);

		JLabel lblSkill = new JLabel("SKILL");
		lblSkill.setBounds(144, 416, 46, 14);
		frame.getContentPane().add(lblSkill);

		mpskill_1 = new JTextField();
		mpskill_1.setBounds(160, 466, 86, 20);
		frame.getContentPane().add(mpskill_1);
		mpskill_1.setColumns(10);

		JLabel lblMpSkill = new JLabel("MP SKILL");
		lblMpSkill.setBounds(104, 469, 46, 14);
		frame.getContentPane().add(lblMpSkill);

		hp_2 = new JTextField();
		hp_2.setBounds(347, 366, 54, 20);
		frame.getContentPane().add(hp_2);
		hp_2.setColumns(10);

		mp_2 = new JTextField();
		mp_2.setColumns(10);
		mp_2.setBounds(347, 413, 54, 20);
		frame.getContentPane().add(mp_2);

		dps_2 = new JTextField();
		dps_2.setColumns(10);
		dps_2.setBounds(482, 366, 54, 20);
		frame.getContentPane().add(dps_2);

		skill_2 = new JTextField();
		skill_2.setColumns(10);
		skill_2.setBounds(482, 413, 54, 20);
		frame.getContentPane().add(skill_2);

		JLabel lblNewLabel_3 = new JLabel("DPS");
		lblNewLabel_3.setBounds(445, 369, 25, 14);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblSkill_1 = new JLabel("SKILL");
		lblSkill_1.setBounds(445, 416, 30, 14);
		frame.getContentPane().add(lblSkill_1);

		JLabel lblMp_1 = new JLabel("MP");
		lblMp_1.setBounds(316, 416, 46, 14);
		frame.getContentPane().add(lblMp_1);

		JLabel lblHp_1 = new JLabel("HP");
		lblHp_1.setBounds(316, 369, 25, 14);
		frame.getContentPane().add(lblHp_1);

		mpskill_2 = new JTextField();
		mpskill_2.setColumns(10);
		mpskill_2.setBounds(450, 466, 86, 20);
		frame.getContentPane().add(mpskill_2);

		JLabel lblMpSkill_1 = new JLabel("MP SKILL");
		lblMpSkill_1.setBounds(394, 469, 46, 14);
		frame.getContentPane().add(lblMpSkill_1);

		btnNewButton_1 = new JButton("Atacar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mago.atacar(guerrero);
				if (guerrero.getHp()>=0){
				String dhp = String.valueOf(guerrero.getHp());
				hp_2.setText(dhp);
				}
				if (guerrero.getHp()<0)
				{
					hp_2.setText("Muerto");
				}

			}
		});
		btnNewButton_1.setBounds(28, 514, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnSkill = new JButton("Skill");
		btnSkill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mago.usarSkill(guerrero);
				if (guerrero.getHp()>=0){
					String dhp = String.valueOf(guerrero.getHp());
					hp_2.setText(dhp);
						if (mago.getMp()>=0){
							String dmp = String.valueOf(mago.getMp());
							mp_1.setText(dmp);

						}

					}
				if (guerrero.getHp()<0)
				{
					hp_2.setText("Muerto");
				}
			}
		});
		btnSkill.setBounds(160, 514, 89, 23);
		frame.getContentPane().add(btnSkill);

		JButton btnAtacar = new JButton("Atacar");
		btnAtacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guerrero.atacar(mago);
				if (mago.getHp()>=0){
					String dhp = String.valueOf(mago.getHp());
					hp_1.setText(dhp);
					}
				if (mago.getHp()<0)
				{
					hp_1.setText("Muerto");
				}


			}
		});
		btnAtacar.setBounds(316, 514, 89, 23);
		frame.getContentPane().add(btnAtacar);

		JButton btnSkill_1 = new JButton("Skill");
		btnSkill_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guerrero.usarSkill(mago);
				if (mago.getHp()>=0){
				String dhp = String.valueOf(mago.getHp());
				hp_1.setText(dhp);
				}
				if (mago.getHp()<0)
				{
					hp_1.setText("Muerto");
				}

			}
		});
		btnSkill_1.setBounds(447, 514, 89, 23);
		frame.getContentPane().add(btnSkill_1);
	}
}
