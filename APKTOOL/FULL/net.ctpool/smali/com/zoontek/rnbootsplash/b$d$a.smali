.class Lcom/zoontek/rnbootsplash/b$d$a;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zoontek/rnbootsplash/b$d;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Ljava/util/Timer;

.field final synthetic n:Lcom/zoontek/rnbootsplash/b$d;


# direct methods
.method constructor <init>(Lcom/zoontek/rnbootsplash/b$d;Ljava/util/Timer;)V
    .locals 0

    iput-object p1, p0, Lcom/zoontek/rnbootsplash/b$d$a;->n:Lcom/zoontek/rnbootsplash/b$d;

    iput-object p2, p0, Lcom/zoontek/rnbootsplash/b$d$a;->m:Ljava/util/Timer;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/zoontek/rnbootsplash/b$d$a;->m:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iget-object v0, p0, Lcom/zoontek/rnbootsplash/b$d$a;->n:Lcom/zoontek/rnbootsplash/b$d;

    iget-object v1, v0, Lcom/zoontek/rnbootsplash/b$d;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    iget-boolean v0, v0, Lcom/zoontek/rnbootsplash/b$d;->n:Z

    invoke-static {v1, v0}, Lcom/zoontek/rnbootsplash/b;->i(Lcom/facebook/react/bridge/ReactApplicationContext;Z)V

    return-void
.end method
