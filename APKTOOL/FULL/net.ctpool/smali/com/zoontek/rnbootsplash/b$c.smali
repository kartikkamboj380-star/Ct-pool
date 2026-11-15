.class Lcom/zoontek/rnbootsplash/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zoontek/rnbootsplash/b;->n(Landroid/app/Activity;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    invoke-static {}, Lcom/zoontek/rnbootsplash/b;->b()Le5/d;

    move-result-object v0

    new-instance v1, Lcom/zoontek/rnbootsplash/b$c$a;

    invoke-direct {v1, p0}, Lcom/zoontek/rnbootsplash/b$c$a;-><init>(Lcom/zoontek/rnbootsplash/b$c;)V

    invoke-virtual {v0, v1}, Le5/d;->b(Ljava/lang/Runnable;)V

    return-void
.end method
