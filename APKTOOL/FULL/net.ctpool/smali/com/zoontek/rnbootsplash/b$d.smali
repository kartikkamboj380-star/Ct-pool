.class Lcom/zoontek/rnbootsplash/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zoontek/rnbootsplash/b;->m(Lcom/facebook/react/bridge/ReactApplicationContext;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/react/bridge/ReactApplicationContext;

.field final synthetic n:Z


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Z)V
    .locals 0

    iput-object p1, p0, Lcom/zoontek/rnbootsplash/b$d;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    iput-boolean p2, p0, Lcom/zoontek/rnbootsplash/b$d;->n:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/zoontek/rnbootsplash/b$d;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {}, Lcom/zoontek/rnbootsplash/b;->c()Lcom/zoontek/rnbootsplash/b$e;

    move-result-object v1

    sget-object v2, Lcom/zoontek/rnbootsplash/b$e;->o:Lcom/zoontek/rnbootsplash/b$e;

    if-eq v1, v2, :cond_5

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/zoontek/rnbootsplash/b;->c()Lcom/zoontek/rnbootsplash/b$e;

    move-result-object v1

    sget-object v2, Lcom/zoontek/rnbootsplash/b$e;->n:Lcom/zoontek/rnbootsplash/b$e;

    if-ne v1, v2, :cond_1

    return-void

    :cond_1
    invoke-static {}, Lcom/zoontek/rnbootsplash/b;->b()Le5/d;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {}, Lcom/zoontek/rnbootsplash/b;->c()Lcom/zoontek/rnbootsplash/b$e;

    move-result-object v1

    sget-object v3, Lcom/zoontek/rnbootsplash/b$e;->m:Lcom/zoontek/rnbootsplash/b$e;

    if-ne v1, v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v2}, Lcom/zoontek/rnbootsplash/b;->g(Lcom/zoontek/rnbootsplash/b$e;)V

    iget-boolean v1, p0, Lcom/zoontek/rnbootsplash/b$d;->n:Z

    if-nez v1, :cond_3

    invoke-static {}, Lcom/zoontek/rnbootsplash/b;->b()Le5/d;

    move-result-object v0

    new-instance v1, Lcom/zoontek/rnbootsplash/b$d$b;

    invoke-direct {v1, p0}, Lcom/zoontek/rnbootsplash/b$d$b;-><init>(Lcom/zoontek/rnbootsplash/b$d;)V

    invoke-virtual {v0, v1}, Le5/d;->a(Ljava/lang/Runnable;)V

    return-void

    :cond_3
    new-instance v1, Le5/d;

    invoke-static {}, Lcom/zoontek/rnbootsplash/b;->d()I

    move-result v2

    const/4 v3, 0x1

    invoke-direct {v1, v0, v2, v3}, Le5/d;-><init>(Landroid/app/Activity;IZ)V

    invoke-static {v1}, Lcom/zoontek/rnbootsplash/b;->e(Le5/d;)V

    invoke-static {}, Lcom/zoontek/rnbootsplash/b;->a()Le5/d;

    move-result-object v0

    new-instance v1, Lcom/zoontek/rnbootsplash/b$d$c;

    invoke-direct {v1, p0}, Lcom/zoontek/rnbootsplash/b$d$c;-><init>(Lcom/zoontek/rnbootsplash/b$d;)V

    invoke-virtual {v0, v1}, Le5/d;->b(Ljava/lang/Runnable;)V

    return-void

    :cond_4
    :goto_0
    invoke-static {}, Lcom/zoontek/rnbootsplash/b;->h()V

    return-void

    :cond_5
    :goto_1
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    new-instance v1, Lcom/zoontek/rnbootsplash/b$d$a;

    invoke-direct {v1, p0, v0}, Lcom/zoontek/rnbootsplash/b$d$a;-><init>(Lcom/zoontek/rnbootsplash/b$d;Ljava/util/Timer;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method
