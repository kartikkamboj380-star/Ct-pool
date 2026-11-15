.class Lcom/zoontek/rnbootsplash/b$d$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zoontek/rnbootsplash/b$d$c;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/zoontek/rnbootsplash/b$d$c;


# direct methods
.method constructor <init>(Lcom/zoontek/rnbootsplash/b$d$c;)V
    .locals 0

    iput-object p1, p0, Lcom/zoontek/rnbootsplash/b$d$c$a;->m:Lcom/zoontek/rnbootsplash/b$d$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    invoke-static {}, Lcom/zoontek/rnbootsplash/b;->a()Le5/d;

    move-result-object v0

    new-instance v1, Lcom/zoontek/rnbootsplash/b$d$c$a$a;

    invoke-direct {v1, p0}, Lcom/zoontek/rnbootsplash/b$d$c$a$a;-><init>(Lcom/zoontek/rnbootsplash/b$d$c$a;)V

    invoke-virtual {v0, v1}, Le5/d;->a(Ljava/lang/Runnable;)V

    return-void
.end method
