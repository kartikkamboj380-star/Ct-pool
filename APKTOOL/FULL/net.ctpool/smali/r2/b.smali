.class public final synthetic Lr2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/facebook/react/modules/toast/ToastModule;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2/b;->m:Lcom/facebook/react/modules/toast/ToastModule;

    iput-object p2, p0, Lr2/b;->n:Ljava/lang/String;

    iput p3, p0, Lr2/b;->o:I

    iput p4, p0, Lr2/b;->p:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lr2/b;->m:Lcom/facebook/react/modules/toast/ToastModule;

    iget-object v1, p0, Lr2/b;->n:Ljava/lang/String;

    iget v2, p0, Lr2/b;->o:I

    iget v3, p0, Lr2/b;->p:I

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/react/modules/toast/ToastModule;->b(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;II)V

    return-void
.end method
