.class public final synthetic Lr2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/facebook/react/modules/toast/ToastModule;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:I

.field public final synthetic p:I

.field public final synthetic q:I

.field public final synthetic r:I


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2/a;->m:Lcom/facebook/react/modules/toast/ToastModule;

    iput-object p2, p0, Lr2/a;->n:Ljava/lang/String;

    iput p3, p0, Lr2/a;->o:I

    iput p4, p0, Lr2/a;->p:I

    iput p5, p0, Lr2/a;->q:I

    iput p6, p0, Lr2/a;->r:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lr2/a;->m:Lcom/facebook/react/modules/toast/ToastModule;

    iget-object v1, p0, Lr2/a;->n:Ljava/lang/String;

    iget v2, p0, Lr2/a;->o:I

    iget v3, p0, Lr2/a;->p:I

    iget v4, p0, Lr2/a;->q:I

    iget v5, p0, Lr2/a;->r:I

    invoke-static/range {v0 .. v5}, Lcom/facebook/react/modules/toast/ToastModule;->c(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;IIII)V

    return-void
.end method
