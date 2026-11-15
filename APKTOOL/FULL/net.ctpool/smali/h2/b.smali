.class public final synthetic Lh2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lh2/c;

.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(Lh2/c;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/b;->m:Lh2/c;

    iput p2, p0, Lh2/b;->n:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh2/b;->m:Lh2/c;

    iget v1, p0, Lh2/b;->n:I

    invoke-static {v0, v1}, Lh2/c;->a(Lh2/c;I)V

    return-void
.end method
