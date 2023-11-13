#include<GL/glut.h>

void init(void)
{
	glClearColor(1.0, 1.0, 1.0, 0.0);
}

void display(void)
{
	glClear(GL_COLOR_BUFFER_BIT);
	glMatrixMode(GL_MODELVIEW);		// Tambah
	glLoadIdentity();		// Tambah

	glScalef(0.5f, 0.5f, 0.0f);
	glBegin(GL_POLYGON);
        glColor3f(0.0f, 0.0f, 1.0f);
        glVertex2f(-0.2f, 0.0f);
        glVertex2f(0.0f, 0.2f);
        glVertex2f(0.2f, 0.0f);
        glVertex2f(0.0f, -0.2f);
	glEnd();

	glTranslatef(0.5f, 0.3f, 0.0f);				// Translasi ke kanan 5 unit dan atas 3 unit
	glRotatef(-45.0f, 0.0f, 0.0f, 1.0f);		// Rotasi 45 derajat searah jarum jam. Parameter sumbu z = 1.0f
	glBegin(GL_POLYGON);
        glColor3f(1.0f, 0.0f, 0.0f);
        glVertex2f(-0.2f, 0.0f);
        glVertex2f(0.0f, 0.2f);
        glVertex2f(0.2f, 0.0f);
        glVertex2f(0.0f, -0.2f);
	glEnd();

	glTranslatef(-0.7f, -0.2f, 0.0f);			// Translasi ke kiri 7 unit dan bawah 2 unit
	glRotatef(45.0f, 0.0f, 0.0f, 1.0f);			// Undo rotasi sebelumnya (dlm kasus ni adlh rotasi baris 16)
	glBegin(GL_POLYGON);
        glColor3f(0.0f, 1.0f, 0.0f);
        glVertex2f(-0.2f, 0.0f);
        glVertex2f(0.0f, 0.2f);
        glVertex2f(0.2f, 0.0f);
        glVertex2f(0.0f, -0.2f);
	glEnd();

	glFlush();
}

void reshape(GLsizei width, GLsizei height)		// Baru (gk wajib)
{
	// Fungsi ni atur gar klo window nya diubah ukuran, maka semuanya akan disesuaikan
	if (height == 0) {
		height = 1;
	}

	GLfloat aspect = (GLfloat)width / (GLfloat)height;
	glViewport(0, 0, width, height);

	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	if (width >= height) {
		gluOrtho2D(-1.0 * aspect, 1.0 * aspect, -1.0, 1.0);
	}
	else {
		gluOrtho2D(-1.0, 1.0, -1.0 / aspect, 1.0 / aspect);
	}
}

int main(int argc, char** argv)
{
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);		// Tambah (gk wajib)
	glutInitWindowSize(600, 400);
	glutInitWindowPosition(200, 100);
	glutCreateWindow("A - 1908107010062 - Muhammad Saifullah Sani");
	glutDisplayFunc(display);
	glutReshapeFunc(reshape);
	init();
	glutMainLoop();

	return 0;
}




/*
Transformasi = Perubahan bentuk dr bentuk semula menjadi baru = Translasi, Rotasi, Penskalaan
Transformasi membutuhkan glMatrixMode(GL_MODEVIEW) dan glLoadIdentity()

Dlm praktikum, penskalaan dilakukan ketika ditekan tombol y atau Y, maka dibersihkan layar menggunakan glClear(1.0, 1.0, 1.0, 0.0),
lalu dipanggil fungsi lain yang menggunakan glScalef yang mana dlm fungsi trsbt diawali dgn glPushMatrix() dan sblm glFlush() ditambahkan
glPopMatrix()

Semua transformasi akan memengaruhi yg bwhnya.
Jd, supaya kembali ke titik asal, lakukan transformasi yg berlawanan seperti baris 34.
*/