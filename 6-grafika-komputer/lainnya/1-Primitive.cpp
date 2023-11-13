#include<GL/glut.h>

void display()
{
	glClearColor(0.0f, 0.0f, 0.0f, 1.0f);	// Blh jgk masukin ke dlm fungsi baru void init() di atasnya, berguna untuk atur background jd itam pekat
	glClear(GL_COLOR_BUFFER_BIT);			// Hapus semua gambar yg sedang tampil

	glBegin(GL_POLYGON);
	glColor3f(1.0f, 0.0f, 0.0f);
		glVertex2f(-0.2f, 0.0f);
		glVertex2f(0.0f, 0.2f);
		glVertex2f(0.2f, 0.0f);
		glVertex2f(0.0f, -0.2f);
	glEnd();

	glFlush();
}

int main(int argc, char **argv)
{
	glutInit(&argc, argv);
	glutInitWindowSize(600, 400);
	glutInitWindowPosition(50, 50);
	glutCreateWindow("A - 1908107010062 - Muhammad Saifullah Sani");
	glutDisplayFunc(display);
	glutMainLoop();

	return 0;
}