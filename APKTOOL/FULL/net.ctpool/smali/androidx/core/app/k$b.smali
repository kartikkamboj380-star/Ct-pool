.class public Landroidx/core/app/k$b;
.super Landroidx/core/app/k$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/app/k$b$c;,
        Landroidx/core/app/k$b$b;,
        Landroidx/core/app/k$b$a;
    }
.end annotation


# instance fields
.field private e:Landroidx/core/graphics/drawable/IconCompat;

.field private f:Landroidx/core/graphics/drawable/IconCompat;

.field private g:Z

.field private h:Ljava/lang/CharSequence;

.field private i:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/core/app/k$h;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroidx/core/app/j;)V
    .locals 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance v1, Landroid/app/Notification$BigPictureStyle;

    invoke-interface {p1}, Landroidx/core/app/j;->a()Landroid/app/Notification$Builder;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/Notification$BigPictureStyle;-><init>(Landroid/app/Notification$Builder;)V

    iget-object v2, p0, Landroidx/core/app/k$h;->b:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/app/Notification$BigPictureStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigPictureStyle;

    move-result-object v1

    iget-object v2, p0, Landroidx/core/app/k$b;->e:Landroidx/core/graphics/drawable/IconCompat;

    const/16 v3, 0x1f

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-lt v0, v3, :cond_1

    instance-of v2, p1, Landroidx/core/app/G;

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, Landroidx/core/app/G;

    invoke-virtual {v2}, Landroidx/core/app/G;->f()Landroid/content/Context;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v4

    :goto_0
    iget-object v5, p0, Landroidx/core/app/k$b;->e:Landroidx/core/graphics/drawable/IconCompat;

    invoke-virtual {v5, v2}, Landroidx/core/graphics/drawable/IconCompat;->t(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/core/app/k$b$c;->a(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/drawable/Icon;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroidx/core/graphics/drawable/IconCompat;->m()I

    move-result v2

    const/4 v5, 0x1

    if-ne v2, v5, :cond_2

    iget-object v2, p0, Landroidx/core/app/k$b;->e:Landroidx/core/graphics/drawable/IconCompat;

    invoke-virtual {v2}, Landroidx/core/graphics/drawable/IconCompat;->j()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/Notification$BigPictureStyle;->bigPicture(Landroid/graphics/Bitmap;)Landroid/app/Notification$BigPictureStyle;

    move-result-object v1

    :cond_2
    :goto_1
    iget-boolean v2, p0, Landroidx/core/app/k$b;->g:Z

    if-eqz v2, :cond_5

    iget-object v2, p0, Landroidx/core/app/k$b;->f:Landroidx/core/graphics/drawable/IconCompat;

    if-nez v2, :cond_3

    invoke-static {v1, v4}, Landroidx/core/app/k$b$a;->a(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/Bitmap;)V

    goto :goto_2

    :cond_3
    instance-of v2, p1, Landroidx/core/app/G;

    if-eqz v2, :cond_4

    check-cast p1, Landroidx/core/app/G;

    invoke-virtual {p1}, Landroidx/core/app/G;->f()Landroid/content/Context;

    move-result-object v4

    :cond_4
    iget-object p1, p0, Landroidx/core/app/k$b;->f:Landroidx/core/graphics/drawable/IconCompat;

    invoke-virtual {p1, v4}, Landroidx/core/graphics/drawable/IconCompat;->t(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    invoke-static {v1, p1}, Landroidx/core/app/k$b$b;->a(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/drawable/Icon;)V

    :cond_5
    :goto_2
    iget-boolean p1, p0, Landroidx/core/app/k$h;->d:Z

    if-eqz p1, :cond_6

    iget-object p1, p0, Landroidx/core/app/k$h;->c:Ljava/lang/CharSequence;

    invoke-static {v1, p1}, Landroidx/core/app/k$b$a;->b(Landroid/app/Notification$BigPictureStyle;Ljava/lang/CharSequence;)V

    :cond_6
    if-lt v0, v3, :cond_7

    iget-boolean p1, p0, Landroidx/core/app/k$b;->i:Z

    invoke-static {v1, p1}, Landroidx/core/app/k$b$c;->c(Landroid/app/Notification$BigPictureStyle;Z)V

    iget-object p1, p0, Landroidx/core/app/k$b;->h:Ljava/lang/CharSequence;

    invoke-static {v1, p1}, Landroidx/core/app/k$b$c;->b(Landroid/app/Notification$BigPictureStyle;Ljava/lang/CharSequence;)V

    :cond_7
    return-void
.end method

.method protected c()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "androidx.core.app.NotificationCompat$BigPictureStyle"

    return-object v0
.end method

.method public h(Landroid/graphics/Bitmap;)Landroidx/core/app/k$b;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroidx/core/graphics/drawable/IconCompat;->f(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Landroidx/core/app/k$b;->f:Landroidx/core/graphics/drawable/IconCompat;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/core/app/k$b;->g:Z

    return-object p0
.end method

.method public i(Landroid/graphics/Bitmap;)Landroidx/core/app/k$b;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroidx/core/graphics/drawable/IconCompat;->f(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Landroidx/core/app/k$b;->e:Landroidx/core/graphics/drawable/IconCompat;

    return-object p0
.end method

.method public j(Ljava/lang/CharSequence;)Landroidx/core/app/k$b;
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/core/app/k$e;->f(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/k$h;->b:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public k(Ljava/lang/CharSequence;)Landroidx/core/app/k$b;
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/core/app/k$e;->f(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/k$h;->c:Ljava/lang/CharSequence;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/core/app/k$h;->d:Z

    return-object p0
.end method
