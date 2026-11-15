.class public abstract Lcom/facebook/react/fabric/mounting/mountitems/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/fabric/mounting/mountitems/MountItem;


# instance fields
.field private a:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/b;->a:I

    return v0
.end method

.method public final c()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/b;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/b;->a:I

    return-void
.end method
