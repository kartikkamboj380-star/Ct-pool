.class public final synthetic Lb4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lb4/x;

.field public final synthetic n:LD4/b;


# direct methods
.method public synthetic constructor <init>(Lb4/x;LD4/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb4/m;->m:Lb4/x;

    iput-object p2, p0, Lb4/m;->n:LD4/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lb4/m;->m:Lb4/x;

    iget-object v1, p0, Lb4/m;->n:LD4/b;

    invoke-static {v0, v1}, Lb4/n;->l(Lb4/x;LD4/b;)V

    return-void
.end method
